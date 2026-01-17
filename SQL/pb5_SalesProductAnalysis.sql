-- SQL query to analyze sales data by joining Sales and Product tables
-- The query selects product names, sales years, and prices by performing an inner join on product

SELECT 
    p.product_name, s.year, s.price 
FROM 
    Sales s 
INNER JOIN 
    Product p 
ON 
    s.product_id = p.product_id;