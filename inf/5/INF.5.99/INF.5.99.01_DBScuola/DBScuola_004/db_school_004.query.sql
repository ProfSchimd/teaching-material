-- Using COUNT: Show the number of classes for each teacher
SELECT T.last_name AS 'Prof.', COUNT(S.description) AS '#Classi'
FROM (teacher AS T JOIN teacher_class AS TC ON T.teacher_id = TC.teacher_id)
	JOIN subject AS S ON TC.subject_id = S.subject_id
GROUP BY T.last_name;

-- Using AVG: Show the average mark of students with an average below 6
SELECT s.student_id, s.last_name, AVG(m.mark) AS AvM
FROM mark AS m JOIN student AS s ON m."student_id" = s.student_id
GROUP BY m.student_id
HAVING AvM < 6;

-- No Aggregation: All marks for all students
SELECT st.last_name, sub.description, mk.mark, mk.date, mk.comment
FROM mark as mk JOIN student as st on mk.student_id = st.student_id
	JOIN subject as sub ON sub.subject_id = mk.subject_id
ORDER BY st.student_id, sub.description, mk.date;

-- Support query: show student-subject-teacher with id's
SELECT s.last_name, s.student_id, c.level, c.section, sub.description, sub.subject_id, t.last_name, t.teacher_id
FROM student AS s JOIN class AS c ON s.class_id = c.class_id
	JOIN teacher_class AS tc ON c.class_id = tc.class_id
	JOIN subject AS sub ON tc.subject_id = sub.subject_id
	JOIN teacher AS t ON tc.teacher_id = t.teacher_id
ORDER BY s.student_id;