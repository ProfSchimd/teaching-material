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
    (1, 'Raimondo', 'Bianchi', '2004-01-01', '2023-02-17 09:00:00', 'Via Roma 2', 'raimondo@example.com'),
    (2, 'Edoardo', 'Conte', '2004-08-19', '2023-02-17 09:30:00', 'Piazza Chiesa 7', 'edoardo@example.com'),
    (3, 'Mario', 'Bianchi', '2008-05-10', '2023-02-17 10:00:00', 'Via Monte Bianco 18/1', 'mario@example.com'),
    (4, 'Alice', 'Rossi', '2003-02-20', '2023-02-17 10:30:00', 'Piazza Vecchia 1', 'alice@example.com'),
    (5, 'Mario', 'Rossi', '2007-10-31', '2023-02-17 11:00:00', 'Piazza XX Settembre 20', 'mario2@example.com'),
    (6, 'Barbara', 'Verdi', '2007-04-01', '2023-02-17 11:30:00', 'Corso Milano 208/18', 'barbara@example.com'),
    (7, 'Carlo', 'Rossi', '2006-10-31', '2023-02-17 12:00:00', 'Via dei Tigli 4', 'carlo@example.com'),
    (8, 'Davide', 'Visconti', '2004-06-22', '2023-02-17 12:30:00', 'Vicolo San Giovanni 1B', 'davide@example.com'),
    (9, 'Michela', 'Sciascia', '2006-02-22', '2023-02-17 13:00:00', 'Viale Aldo Moro 161', 'michela@example.com'),
    (10, 'Maria', 'Rossi', '2004-06-15', '2023-02-17 13:30:00', 'Via Garibaldi 1/1', 'maria@example.com'),
    (11, 'Marco', 'Ferrari', '2003-07-22', '2023-02-17 14:00:00', 'Via Roma 3', 'marco@email.it'),
    (12, 'Alessia', 'Bianchi', '2005-05-18', '2023-02-17 14:30:00', 'Via Leonardo da Vinci 7', 'alessia@gmail.com'),
    (13, 'Luca', 'Conti', '2002-12-10', '2023-02-17 15:00:00', 'Piazza San Marco 5', 'luca@example.com'),
    (14, 'Giulia', 'Ricci', '2006-02-28', '2023-02-17 15:30:00', 'Via Dante Alighieri 11', 'giulia@email.it'),
    (15, 'Lorenzo', 'Galli', '2005-11-10', '2023-02-17 16:00:00', 'Piazza del Duomo 2', 'lorenzo@gmail.com'),
    (16, 'Chiara', 'Martini', '2004-03-19', '2023-02-17 16:30:00', 'Via Verdi 9', 'chiara@example.com'),
    (17, 'Davide', 'Moretti', '2008-06-25', '2023-02-17 17:00:00', 'Via Manzoni 6', 'davide@email.it'),
    (18, 'Valentina', 'Rizzo', '2006-08-08', '2023-02-17 17:30:00', 'Piazza della Repubblica 4', 'valentina@gmail.com'),
    (19, 'Simone', 'Greco', '2004-10-17', '2023-02-17 18:00:00', 'Via Garibaldi 1/2', 'simone@example.com');


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
    (1, 'Luca', 'Galli', '1980-03-15', '2005-07-20', 'luca@example.com', '333-1234567'),
    (2, 'Laura', 'Ferrari', '1975-09-28', '2010-02-12', 'laura@example.com', '331-987654'),
    (3, 'Marco', 'Bianchi', '1990-12-10', '2015-11-30', 'marco@example.com', '332-9182736'),
    (4, 'Anna', 'Russo', '1985-06-03', '2008-08-05', 'anna@example.com', '321-0120120'),
    (5, 'Giuseppe', 'Conti', '1992-11-22', '2017-04-15', 'giuseppe@example.com', '333-33113313'),
    (6, 'Antonio', 'Marchese', '1992-11-22', '2017-04-15', 'aconte@email.it', '333-33113313'),
    (7, 'Francesco', 'Noci', '1992-11-22', '2017-04-15', 'francesco.noci@example.com', '333-33113313'),
    (8, 'Aron', 'Zurlo', '1992-11-22', '2017-04-15', 'aron.zurlo@example.com', '333-33113313'),
    (9, 'Elena', 'Ferrari', '1992-11-22', '2017-04-15', 'e.ferrari@gmail.com', '333-33113313'),
    (10, 'Vittoria', 'Olivi', '1992-11-22', '2017-04-15', 'olivi@email.it', '333-33113313'),
    (11, 'Giuliana', 'Ahmed', '1992-11-22', '2017-04-15', 'giuliana@example.com', '333-33113313');


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
    (12, 4, 'A', 'Room 1'),
    (10, 5, 'A', 'Room 9'),
    (7, 1, 'B', 'Room 10'),
    (8, 2, 'B', 'Room 5'),
    (9, 3, 'B', 'Room 7'),
    (15, 4, 'B', 'Room 8'),
    (16, 5, 'B', 'Room 4'),
    (13, 1, 'C', 'Room 20'),
    (14, 1, 'D', 'Room 21');


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
