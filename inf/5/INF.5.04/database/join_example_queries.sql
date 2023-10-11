-- Esempio di INNER JOIN
SELECT S.last_name, S.first_name, C.level, C.section
FROM Student AS S LEFT JOIN Class AS C
ON S.class = C.class_id;

