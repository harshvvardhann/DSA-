-- SQL query to find customers who visited but did not make any transactions
-- The query selects customer IDs and counts of visits without transactions by performing a left join between Visits and Transactions

SELECT 
    v.customer_id, COUNT(v.customer_id) AS count_no_trans
FROM
    Visits v
LEFT JOIN
    Transactions t
ON
    v.visit_id = t.visit_id
WHERE
    t.visit_id IS NULL
GROUP BY 
    v.customer_id;