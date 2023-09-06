-- Creazione della tabella Student
CREATE TABLE IF NOT EXISTS Student (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birth_date DATE,
    registration_date DATETIME DEFAULT '2023-01-01 00:00:00',
    home_address VARCHAR(255) DEFAULT NULL,
    email VARCHAR(100) NOT NULL
);

-- Inserimento dei dati nella tabella Student
INSERT INTO Student (student_id, first_name, last_name, birth_date, registration_date, home_address, email)
VALUES
    (1, 'Raimondo', 'Bianchi', '2004-01-01', '2023-02-17 09:00:00', '123 Main St', 'raimondo@example.com'),
    (2, 'Edoardo', 'Conte', '2004-08-19', '2023-02-17 09:30:00', '456 Elm St', 'edoardo@example.com'),
    (3, 'Mario', 'Bianchi', '2008-05-10', '2023-02-17 10:00:00', '789 Oak St', 'mario@example.com'),
    (4, 'Alice', 'Rossi', '2003-02-20', '2023-02-17 10:30:00', '101 Maple St', 'alice@example.com'),
    (5, 'Mario', 'Rossi', '2007-10-31', '2023-02-17 11:00:00', '202 Cedar St', 'mario2@example.com'),
    (6, 'Barbara', 'Verdi', '2007-04-01', '2023-02-17 11:30:00', '303 Pine St', 'barbara@example.com'),
    (7, 'Carlo', 'Rossi', '2006-10-31', '2023-02-17 12:00:00', '404 Birch St', 'carlo@example.com'),
    (8, 'Davide', 'Visconti', '2004-06-22', '2023-02-17 12:30:00', '505 Redwood St', 'davide@example.com'),
    (9, 'Michela', 'Sciascia', '2006-02-22', '2023-02-17 13:00:00', '606 Cedar St', 'michela@example.com');


-- Creazione della tabella Teacher
CREATE TABLE IF NOT EXISTS Teacher (
    teacher_id INT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birth_date DATE,
    hire_date DATE,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15)
);

-- Inserimento dei dati nella tabella Teacher
INSERT INTO Teacher (teacher_id, first_name, last_name, birth_date, hire_date, email, phone_number)
VALUES
    (1, 'Luca', 'Galli', '1980-03-15', '2005-07-20', 'luca@example.com', '123-456-789'),
    (2, 'Laura', 'Ferrari', '1975-09-28', '2010-02-12', 'laura@example.com', '987-654-321'),
    (3, 'Marco', 'Bianchi', '1990-12-10', '2015-11-30', 'marco@example.com', '111-222-333'),
    (4, 'Anna', 'Russo', '1985-06-03', '2008-08-05', 'anna@example.com', '555-888-777'),
    (5, 'Giuseppe', 'Conti', '1992-11-22', '2017-04-15', 'giuseppe@example.com', '777-333-111');


-- Creazione della tabella Class
CREATE TABLE IF NOT EXISTS Class (
    class_id INT PRIMARY KEY,
    level INT DEFAULT 1 CHECK (level >= 1 AND level <= 5),
    section VARCHAR(8) DEFAULT 'A',
    location VARCHAR(16)
);

-- Inserimento dei dati nella tabella Class
INSERT INTO Class (class_id, level, section, location)
VALUES
    (2, 1, 'A', 'Room 2'),
    (3, 2, 'A', 'Room 5'),
    (5, 3, 'A', 'Room 3'),
    (7, 5, 'B', 'Room 4'),
    (10, 5, 'A', 'Room 9'),
    (12, 4, 'A', 'Room 1');

-- Creazione della tabella TeacherClass
CREATE TABLE IF NOT EXISTS TeacherClass (
    teacher_id INT,
    class_id INT,
    FOREIGN KEY (teacher_id) REFERENCES Teacher(teacher_id),
    FOREIGN KEY (class_id) REFERENCES Class(class_id)
);

-- Inserimento dei dati nella tabella TeacherClass
INSERT INTO TeacherClass (teacher_id, class_id)
VALUES
    (1, 2),
    (2, 3),
    (3, 5);
