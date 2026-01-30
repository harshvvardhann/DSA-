
-- Query to find the primary department for each employee
-- An employee's primary department is either explicitly marked with primary_flag='Y' 
-- or is their only department if they only work in one department

SELECT 
	employee_id,                    -- Employee's unique identifier
	department_id                   -- The primary department for this employee
FROM
	Employee e
WHERE
	primary_flag = 'Y'              -- Condition 1: Explicitly marked as primary department
OR
	-- Condition 2: Employee only belongs to one department (so that one is their primary by default)
	employee_id IN (
		SELECT employee_id 
		FROM Employee 
		GROUP BY employee_id 
		HAVING COUNT(*) = 1         -- Filter to employees with exactly 1 department
	)