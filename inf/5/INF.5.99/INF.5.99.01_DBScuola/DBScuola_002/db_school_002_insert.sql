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
