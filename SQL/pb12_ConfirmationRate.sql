-- This query calculates the confirmation rate for each user.
-- The confirmation rate is defined as the number of confirmed actions divided by the total number of actions
-- for each user. If a user has no actions, their confirmation rate is considered to be 0.


SELECT
    s.user_id,
    ROUND(
        -- Using IFNULL to handle cases where there are no actions for a user 
        -- to avoid division by zero 
        -- and return 0 instead of NULL 
        IFNULL(
            SUM(c.action = 'confirmed') / COUNT(c.action),
            0
        ),
        2
    ) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
    ON s.user_id = c.user_id
GROUP BY s.user_id;