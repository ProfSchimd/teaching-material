SELECT first_name, last_name, birth_date
FROM student
WHERE class_id = 5 OR class_id = 6;

SELECt student_id, last_name, first_name
FROM student INNER JOIN class
ON student.class_id = class.class_id
WHERE class.level = 4 AND class.section = 'A';