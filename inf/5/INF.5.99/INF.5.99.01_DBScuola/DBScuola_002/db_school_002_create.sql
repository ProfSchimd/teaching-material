CREATE TABLE class(
	class_id INT PRIMARY KEY,
	level INT NOT NULL,
	section VARCHAR(6) NOT NULL,
	room VARCHAR(128) UNIQUE
);

CREATE TABLE student (
	student_id INT PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	birth_date DATE,
	class_id INT NOT NULL,
	FOREIGN KEY (class_id) REFERENCES class("class_id")
);