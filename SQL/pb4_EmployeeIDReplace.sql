-- This SQL script replaces Employee IDs with unique identifiers from the EmployeeUNI table

SELECT 
    eu.unique_id 
AS 
    unique_id, e.name 
AS  
    name 
FROM 
    Employees e 
LEFT JOIN 
    EmployeeUNI eu 
ON 
    e.id = eu.id;