-- Query to get the price of each product as of a specific date (2019-08-16)
-- Returns the most recent price before or on that date, or default price (10) if no change recorded

SELECT  
    p.product_id,
    -- IFNULL returns the new_price if it exists, otherwise returns default price of 10
    IFNULL(t.new_price,10) AS price
FROM
    -- Get all distinct products to ensure every product appears in results
    (SELECT DISTINCT product_id FROM Products) p
LEFT JOIN
    -- Subquery to get the most recent price change for each product on or before 2019-08-16
    (
        SELECT product_id, new_price
        FROM Products
        WHERE 
            -- Find rows where product_id and change_date match the max date for that product
            (product_id,change_date) IN
            (
                -- Get the maximum (latest) change_date for each product before or on 2019-08-16
                SELECT product_id,MAX(change_date) 
                FROM Products 
                WHERE change_date <= '2019-08-16'    -- Only consider changes on or before this date
                GROUP BY product_id                   -- Find the latest change for each product
            )
    ) t
ON p.product_id = t.product_id;  -- Left join ensures all products are included even if no price change exists