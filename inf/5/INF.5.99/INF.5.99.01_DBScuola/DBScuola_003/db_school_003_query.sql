--- Three table join: List of subjects and teacher for each class
SELECT c.level, c.section, tc.subject, t.last_name
FROM (class AS c JOIN teacher_class AS tc ON c.class_id = tc.class_id)
			JOIN teacher AS t ON tc.teacher_id = t.teacher_id;