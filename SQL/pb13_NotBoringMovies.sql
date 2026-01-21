-- This query retrieves all movies from the Cinema table
-- that have an odd id and are not described as 'boring'.
SELECT * from Cinema WHERE id % 2 = 1 AND description != 'boring' ORDER BY rating DESC;