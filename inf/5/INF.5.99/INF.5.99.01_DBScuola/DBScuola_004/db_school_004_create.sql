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

CREATE TABLE subject(
    subject_id INT PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    code VARCHAR(8) UNIQUE NOT NULL
);

CREATE TABLE teacher_class (
    teacher_id INT,
    class_id INT,
    subject_id INT NOT NULL,
    PRIMARY KEY (teacher_id, class_id),
    FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id),
    FOREIGN KEY (class_id) REFERENCES class(class_id),
    FOREIGN KEY (subject_id) REFERENCES subject(subject_id)
);

CREATE TABLE mark(
    mark_id INT PRIMARY KEY,
    student_id INT NOT NULL,
    subject_id INT NOT NULL,
    teacher_id INT NOT NULL,
    mark DECIMAL(2) NOT NULL CHECK (mark >= 0 AND mark <= 10),
    date DATE NOT NULL,
    comment TEXT,
    FOREIGN KEY (student_id) REFERENCES student(student_id),
    FOREIGN KEY (subject_id) REFERENCES subject(subject_id),
    FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id)
);


)
