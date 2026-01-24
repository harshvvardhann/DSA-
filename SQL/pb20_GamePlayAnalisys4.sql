SELECT
    -- Calculate the fraction of players who logged in again
    -- on the day immediately after their first login
    ROUND(
        -- Numerator:
        -- Count of DISTINCT players who satisfy the condition
        -- in the WHERE clause (day-1 return users)
        COUNT(DISTINCT player_id)
        /
        -- Denominator:
        -- Total number of DISTINCT players in the Activity table
        (SELECT COUNT(DISTINCT player_id) FROM Activity),
        -- Round the final fraction to 2 decimal places
        2
    ) AS fraction

FROM Activity
-- Each row in Activity represents a login event
-- for a player on a specific date

WHERE
    -- Row-wise comparison (tuple comparison):
    -- For each activity row, we check if:
    --   (player_id, event_date - 1 day)
    -- matches
    --   (player_id, first_login_date)
    --
    -- This effectively checks whether the player
    -- logged in exactly one day after their first login
    (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
    IN (
        -- Subquery:
        -- Finds the FIRST login date for each player
        -- MIN(event_date) gives the earliest login
        SELECT
            player_id,
            MIN(event_date)
        FROM Activity
        GROUP BY player_id
    );
