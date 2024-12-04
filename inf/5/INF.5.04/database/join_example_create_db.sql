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


-- Creazione della tabella Student
CREATE TABLE IF NOT EXISTS Student (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birth_date DATE,
    registration_date DATETIME DEFAULT '2023-01-01 00:00:00',
    home_address VARCHAR(255) DEFAULT NULL,
    email VARCHAR(100) NOT NULL,
    class INT
);

-- Inserimento dei dati nella tabella Student
INSERT INTO Student (student_id, first_name, last_name, birth_date, registration_date, home_address, email, class)
VALUES
    (1, 'Raimondo', 'Bianchi', '2004-01-01', '2023-02-17 09:00:00', '123 Main St', 'raimondo@example.com', 7),
    (2, 'Edoardo', 'Conte', '2004-08-19', '2023-02-17 09:30:00', '456 Elm St', 'edoardo@example.com', 7),
    (3, 'Mario', 'Bianchi', '2008-05-10', '2023-02-17 10:00:00', '789 Oak St', 'mario@example.com', 2),
    (4, 'Alice', 'Rossi', '2003-02-20', '2023-02-17 10:30:00', '101 Maple St', 'alice@example.com', 7),
    (5, 'Mario', 'Rossi', '2007-10-31', '2023-02-17 11:00:00', '202 Cedar St', 'mario2@example.com', 3),
    (6, 'Barbara', 'Verdi', '2007-04-01', '2023-02-17 11:30:00', '303 Pine St', 'barbara@example.com', 3),
    (7, 'Carlo', 'Rossi', '2006-10-31', '2023-02-17 12:00:00', '404 Birch St', 'carlo@example.com', 12),
    (8, 'Davide', 'Visconti', '2004-06-22', '2023-02-17 12:30:00', '505 Redwood St', 'davide@example.com', 10),
    (9, 'Michela', 'Sciascia', '2006-02-22', '2023-02-17 13:00:00', '606 Cedar St', 'michela@example.com', 12);
