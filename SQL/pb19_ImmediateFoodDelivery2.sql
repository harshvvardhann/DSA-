SELECT
    -- Calculate the percentage of customers whose FIRST order
    -- was delivered immediately (order_date = preferred delivery date)
    ROUND(
        -- AVG(boolean_expression):
        -- In MySQL, (order_date = customer_pref_delivery_date) returns:
        --   1 → if the order was immediate
        --   0 → if the order was not immediate
        --
        -- AVG() of 1s and 0s gives the fraction of immediate deliveries
        -- Multiply by 100 to convert fraction into percentage
        AVG(order_date = customer_pref_delivery_date) * 100,
        -- Round the percentage to 2 decimal places
        2
    ) AS immediate_percentage

FROM Delivery
-- Each row in Delivery represents one order
-- with its order date and preferred delivery date

WHERE
    -- Filter ONLY the FIRST order of each customer
    -- (customer_id, order_date) tuple ensures we select
    -- the row where order_date is the minimum (earliest)
    -- for that customer
    (customer_id, order_date) IN 
    (
        -- Subquery:
        -- Finds the first (earliest) order_date for each customer
        SELECT
            customer_id,
            MIN(order_date)
        FROM Delivery
        GROUP BY customer_id
    );
