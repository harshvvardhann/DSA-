-- Query to find the number of direct reports for each employee and their average age
-- Uses a self-join on the Employees table to match managers with their subordinates

SELECT
	m.employee_id,          -- Manager's employee ID
	m.name,                 -- Manager's name
	COUNT(e.employee_id) AS reports_count,     -- Number of employees directly reporting to this manager
	ROUND(AVG(e.age)) AS average_age           -- Average age of employees reporting to this manager (rounded to nearest integer)
FROM
	Employees m             -- Alias 'm' represents managers/supervisors
JOIN 
    Employees e             -- Alias 'e' represents employees (direct reports)
ON 
    m.employee_id = e.reports_to  -- Self-join condition: match managers with employees whose reports_to field matches manager's ID
GROUP BY
	m.employee_id,m.name    -- Group results by each unique manager to aggregate their reports
ORDER BY
	m.employee_id           -- Sort results by manager's employee ID in ascending order