drop schema public cascade;

drop table students if exists;
create table students
(
    id         INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    email      VARCHAR(255),
    password   VARCHAR(255),
    login      VARCHAR(255)
);

drop table subjects if exists;
create table subjects
(
    id          INT NOT NULL PRIMARY KEY,
    name        varchar(255),
    description varchar(255),
    teacher_id  INT,
    start_date  DATE,
    end_date    DATE,
    grade_date  DATE
);

drop table teachers if exists;
create table teachers
(
    id         INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    login      VARCHAR(255)
);

drop table authors if exists;
create table authors
(
    id         INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255)
);

drop table books if exists;
create table books
(
    id             INT NOT NULL PRIMARY KEY,
    title          VARCHAR(255),
    author         INT,
    published_date DATE,
    FOREIGN KEY (author) REFERENCES authors (id)
);

drop table borrows if exists;
create table borrows
(
    id          INT NOT NULL PRIMARY KEY,
    student_id  INT,
    book_id     INT,
    borrow_date INT,
    return_date INT,
    status      BIT
);

INSERT INTO students (id, first_name, last_name, email, password, login)
VALUES (1, 'Cem', 'Arslan', 'cemarslan@gmail.com', '123123', 'cem.arslan');
INSERT INTO students (id, first_name, last_name, email, password, login)
VALUES (2, 'Ali Riza', 'Yucefaydali', 'aliriza@gmail.com', 'abcabc', 'ali.riza');

INSERT INTO teachers (id, first_name, last_name, login)
values (1, 'Cezar', 'Holub', 'cezar.holub');
INSERT INTO teachers (id, first_name, last_name, login)
values (2, 'Pawel', 'Moriewic', 'pawel.moriewic');

INSERT INTO subjects (id, name, description, teacher_id, start_date, end_date, grade_date)
VALUES (1, 'Math', 'Math Subject Description', 1, '2016-01-02', '2017-01-02', '2017-01-02');

INSERT INTO authors (id, first_name, last_name)
VALUES (1, 'Salim', 'Isler');
INSERT INTO authors (id, first_name, last_name)
VALUES (2, 'Kadir', 'Kocak');

INSERT INTO books (id, title, author, published_date)
VALUES (1, 'Book 1', 1, '1997-01-02');

INSERT INTO books (id, title, author, published_date)
VALUES (2, 'Book 2', 1, '1991-01-02');
