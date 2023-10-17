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

CREATE TABLE teacher (
    teacher_id INT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	birth_date DATE,
    hire_date DATE,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15)
);

CREATE TABLE teacher_class (
    teacher_id INT,
    class_id INT,
    subject VARCHAR(255),
    PRIMARY KEY(teacher_id, class_id),
    FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id),
    FOREIGN KEY (class_id) REFERENCES class(class_id)
)