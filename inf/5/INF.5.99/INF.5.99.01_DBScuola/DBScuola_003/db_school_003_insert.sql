INSERT INTO class (class_id, level, section, room)
VALUES
    (1, 1, 'A', 'Room 100'),
    (2, 2, 'A', 'Room 306'),
    (3, 3, 'A', 'Room 203'),
    (4, 4, 'A', 'Room 202'),
    (5, 5, 'A', 'Room 204'),
    (6, 5, 'B', 'Room 101');

INSERT INTO student (student_id, first_name, last_name, birth_date, class_id)
VALUES
    (1, 'Raimondo', 'Bianchi', '2005-01-31', 6),
    (2, 'Edoardo', 'Conte', '2004-08-19', 6),
    (3, 'Mario', 'Bianchi', '2008-05-10', 2),
    (4, 'Alice', 'Rossi', NULL, 6),
    (5, 'Mario', 'Rossi', '2007-10-31', 3),
    (6, 'Barbara', 'Verdi', '2007-04-01', 3),
    (7, 'Carlo', 'Rossi', '2006-10-31', 4),
    (8, 'Davide', 'Visconti', '2004-06-22', 5),
    (9, 'Michela', 'Sciascia', '2006-02-22', 4),
    (10, 'Lorenzo', 'Ferrari', '2005-12-15', 5),
    (11, 'Elena', 'De Marchi', '2009-03-05', 1),
    (12, 'Gabriele', 'Russo', '2005-08-12', 6);

INSERT INTO teacher (teacher_id, first_name, last_name, birth_date, hire_date, email, phone_number)
VALUES
    (1, 'Luca', 'Galli', '1980-03-15', '2005-07-20', 'luca@example.com', '123-456-789'),
    (2, 'Laura', 'Ferrari', '1975-09-28', '2010-02-12', 'laura@example.com', '987-654-321'),
    (3, 'Marco', 'Bianchi', '1990-12-10', '2015-11-30', 'marco@example.com', NULL),
    (4, 'Anna', 'Russo', '1985-06-03', '2008-08-05', 'anna@example.com', '555-888-777'),
    (5, 'Giuseppe', 'Conti', '1992-11-22', '2017-04-15', 'giuseppe@example.com', '777-333-111');


INSERT INTO teacher_class (teacher_id, class_id, subject)
VALUES
    (1, 1, 'Italiano'),
    (1, 2, 'Italiano'),
    (2, 1, 'Matematica'),
    (2, 3, 'Matematica'),
    (3, 5, 'Informatica'),
    (3, 6, 'Sistemi e Reti'),
    (3, 4, 'Sistemi e Reti'),
    (4, 3, 'Scienze Motorie'),
    (4, 4, 'Scienze Motorie'),
    (5, 1, 'Scienze'),
    (5, 2, 'Scienze'),
    (1, 5, 'Italiano');

