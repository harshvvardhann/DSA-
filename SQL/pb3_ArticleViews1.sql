-- SQL query to find all authors who have viewed their own articles
-- The query selects distinct author IDs from the Views table where the author_id matches the viewer_id

SELECT 
    eni.unique_id, e.name 
FROM 
    Employees e 
LEFT JOIN 
    EmployeeUNI eni 
ON 
    e.id = eni.id;