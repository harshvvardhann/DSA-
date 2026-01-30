-- Query to determine if three given sides can form a valid triangle
-- Uses the Triangle Inequality Theorem: sum of any two sides must be greater than the third side

SELECT 
    x, y, z,
    -- Check all three conditions of triangle inequality theorem:
    -- 1. x + y > z (sum of x and y greater than z)
    -- 2. x + z > y (sum of x and z greater than y)
    -- 3. y + z > x (sum of y and z greater than x)
    -- Returns 'Yes' if all conditions are true, 'No' otherwise
    CASE 
        WHEN x + y > z AND x + z > y AND y + z > x THEN 'Yes' 
        ELSE 'No' 
    END AS triangle
FROM Triangle