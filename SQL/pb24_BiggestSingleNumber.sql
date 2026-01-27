-- Write your MySQL query statement below
-- This query finds the largest number that appears exactly once in the table

SELECT 
	MAX(num) AS num                   -- Find the maximum value
FROM 
	MyNumbers
WHERE
	num IN (
		-- Subquery: Find all numbers that appear exactly once
		SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(*) = 1
	)