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
    id               INT NOT NULL PRIMARY KEY,
    name             varchar(255),
    description      varchar(255),
    teacher_id       INT,
    start_date       DATE,
    end_date         DATE,
    grade_date       DATE,
    grade            DOUBLE,
);

drop table teachers if exists;
create table teachers
(
    id         INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    login      VARCHAR(255)
);

drop table books if exists;
create table books
(
    id             INT NOT NULL PRIMARY KEY,
    title          VARCHAR(255),
    author_id      INT,
    published_date DATE,
    FOREIGN KEY (author_id)
);

drop table authors if exists;
create table authors
(
    id         INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
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