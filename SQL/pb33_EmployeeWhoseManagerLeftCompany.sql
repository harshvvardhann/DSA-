-- Problem: Find employees whose manager has left the company
-- An employee is identified if:
-- 1. Their salary is less than 30000
-- 2. They have a manager assigned (manager_id is not null)
-- 3. Their manager_id doesn't exist in the employee list (manager has left)

SELECT 
    employee_id
FROM 
    Employees
WHERE
    salary < 30000  -- Filter employees with salary less than 30000
AND 
    manager_id IS NOT NULL  -- Ensure employee has a manager assigned
AND 
    -- Check if manager_id is not present in the employee_id list (manager has left the company)
    manager_id NOT IN (SELECT employee_id FROM Employees)
ORDER BY
    employee_id;  -- Sort results in ascending order by employee_id