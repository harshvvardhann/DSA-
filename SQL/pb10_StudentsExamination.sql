-- SQL Query to list each student with all subjects and the count of exams attended for each subject
-- If a student has not attended any exam for a subject, the count should be 0.
-- The result should include all students and all subjects.


SELECT
    st.student_id,st.student_name,sb.subject_name,COUNT(e.subject_name) as attended_exams
FROM
    Students st
CROSS JOIN
    Subjects sb
LEFT JOIN 
    Examinations e
ON
    st.student_id = e.student_id
AND
    e.subject_name = sb.subject_name
GROUP BY
    st.student_id,st.student_name,sb.subject_name
ORDER BY
    st.student_id,sb.subject_name