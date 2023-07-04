drop schema public cascade;

drop table students if exists;
create table students
(
    id         INTEGER IDENTITY PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    email      VARCHAR(255),
    password   VARCHAR(255),
    login      VARCHAR(255)
);

drop table subjects if exists;
create table subjects
(
    id          INTEGER IDENTITY PRIMARY KEY,
    name        varchar(255),
    description varchar(255),
    teacher_id  INT,
    start_date  varchar(255),
    end_date    varchar(255),
    grade_date  varchar(255)
);

drop table teachers if exists;
create table teachers
(
    id         INTEGER IDENTITY PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    email      VARCHAR(255),
    password   VARCHAR(255),
    login      VARCHAR(255)
);

drop table authors if exists;
create table authors
(
    id         INTEGER IDENTITY PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255)
);

drop table books if exists;
create table books
(
    id             INTEGER IDENTITY PRIMARY KEY,
    title          VARCHAR(255),
    author_id      INT,
    published_date DATE,
    FOREIGN KEY (author_id) REFERENCES authors (id)
);

drop table borrows if exists;
create table borrows
(
    id          INTEGER IDENTITY PRIMARY KEY,
    student_id  INT,
    book_id     INT,
    borrow_date VARCHAR(255),
    return_date VARCHAR(255),
    status      BIT,
    FOREIGN KEY (student_id) REFERENCES students (id),
    FOREIGN KEY (book_id) REFERENCES books (id)
);

drop table grades if exists;
create table grades
(
    id         INTEGER IDENTITY PRIMARY KEY,
    grade      INT,
    student_id INT,
    subject_id INT,
    FOREIGN KEY (student_id) REFERENCES students (id),
    FOREIGN KEY (subject_id) REFERENCES subjects (id)
);

INSERT INTO students (first_name, last_name, email, password, login)
VALUES ('Cem', 'Arslan', 'cemarslan@gmail.com', '123123', 'cem.arslan');
INSERT INTO students (first_name, last_name, email, password, login)
VALUES ('Ali Riza', 'Yucefaydali', 'aliriza@gmail.com', 'abcabc', 'ali.riza');

INSERT INTO teachers (first_name, last_name, email, password, login)
VALUES ('Cezar', 'Holub', 'cezar.holub@gmail.com', '123321', 'cezar.holub');
INSERT INTO teachers (first_name, last_name, email, password, login)
VALUES ('Pawel', 'Moriewic', 'pawel.moriewic@gmail.com', '123123123', 'pawel.moriewic');

INSERT INTO subjects (name, description, teacher_id, start_date, end_date, grade_date)
VALUES ('Math', 'Math Subject Description', 1, '2016-01-02', '2017-01-02', '2017-01-02');
INSERT INTO subjects (name, description, teacher_id, start_date, end_date, grade_date)
VALUES ('Business Application Programming', 'Business Application Programming Description', 0, '2016-01-02',
        '2017-01-02', '2017-01-02');

INSERT INTO authors (first_name, last_name)
VALUES ('Salim', 'Isler');
INSERT INTO authors (first_name, last_name)
VALUES ('Kadir', 'Kocak');

INSERT INTO books (title, author_id, published_date)
VALUES ('Book 1', 0, '1997-01-02');
INSERT INTO books (title, author_id, published_date)
VALUES ('Book 2', 0, '1991-01-02');
INSERT INTO books (title, author_id, published_date)
VALUES ('Book 3', 0, '1992-01-02');
INSERT INTO books (title, author_id, published_date)
VALUES ('Book 4', 1, '1993-01-02');
INSERT INTO books (title, author_id, published_date)
VALUES ('Book 5', 1, '1994-01-02');

INSERT INTO borrows (student_id, book_id, borrow_date, return_date, status)
VALUES (0, 0, '2016-01-02', '2016-02-02', 0);
INSERT INTO borrows (student_id, book_id, borrow_date, return_date, status)
VALUES (0, 1, '2016-01-02', '2016-02-02', 0);
INSERT INTO borrows (student_id, book_id, borrow_date, return_date, status)
VALUES (1, 2, '2016-01-02', '2016-02-02', 0);
INSERT INTO borrows (student_id, book_id, borrow_date, return_date, status)
VALUES (1, 3, '2016-01-02', '2016-02-02', 0);
INSERT INTO borrows (student_id, book_id, borrow_date, return_date, status)
VALUES (1, 4, '2016-01-02', '2016-02-02', 0);

INSERT INTO grades (grade, student_id, subject_id)
VALUES (45, 0, 0);
INSERT INTO grades (grade, student_id, subject_id)
VALUES (90, 0, 1);
