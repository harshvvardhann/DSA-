-- Problem: Find the top 3 highest salaries in each department
-- Approach: For each employee, count how many distinct salaries in their department
--           are higher than their salary. If count < 3, they're in top 3.

-- Main Query: Select department name, employee name, and salary
-- d.name AS Department  - Name of the department
-- e.name AS Employee    - Name of the employee
-- e.salary AS SALARY    - Salary of the employee
SELECT d.name AS Department, e.name AS Employee, e.salary AS SALARY 
FROM Employee e

-- Join with Department table to get department names
JOIN Department d ON e.departmentId = d.id

-- Filter condition: Keep employees in top 3 of their department
-- Subquery counts how many DISTINCT salaries in the same department are HIGHER than current employee's salary
-- If this count < 3, the employee is among the top 3 salaries in their department
WHERE 3 > (
    -- Subquery: Count distinct salaries higher than current employee
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    -- Only consider employees in the same department
    WHERE e2.departmentId = e.departmentId
      -- Only count salaries strictly greater than current employee's salary
      AND e2.salary > e.salary
);