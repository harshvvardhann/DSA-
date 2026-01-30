-- Query to find numbers that appear at least 3 consecutive times in the Logs table
-- Uses self-joins to match 3 consecutive rows with the same number value

SELECT 
	DISTINCT l1.num as ConsecutiveNums  -- Distinct ensures each consecutive number appears only once in results
FROM
	Logs l1
JOIN
	Logs l2 ON l1.id = l2.id - 1        -- Join to get the next consecutive row (id + 1)
JOIN
	Logs l3 ON l2.id = l3.id - 1        -- Join to get another next consecutive row (id + 2)
WHERE
	l1.num = l2.num                     -- Check if first and second rows have the same number
AND
	l2.num = l3.num                     -- Check if second and third rows have the same number
	                                    -- Combined: all three consecutive rows must have identical numbers