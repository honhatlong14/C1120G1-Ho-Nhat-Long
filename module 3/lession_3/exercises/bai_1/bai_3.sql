create database thu_vien;
use thu_vien;

CREATE TABLE student (
    student_number INT(15) NOT NULL PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    image VARCHAR(8000)
);

CREATE TABLE category (
    category_code INT PRIMARY KEY,
    category_book VARCHAR(50)
);


CREATE TABLE borrowOrder (
    borrow_order_code INT PRIMARY KEY,
    day_of_borring DATE,
    return_day DATE,
    student_number INT,
    FOREIGN KEY (student_number)
        REFERENCES student (student_number)
);

CREATE TABLE book (
    cate INT PRIMARY KEY,
    bokk_name VARCHAR(100) NOT NULL,
    producer VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    manufacture DATE,
    numbe_of_publications INT(100) NOT NULL,
    price INT NOT NULL,
    image VARCHAR(100) NOT NULL,
    category_code INT,
    borrow_order_code INT,
    FOREIGN KEY (category_code)
        REFERENCES category (category_code),
    FOREIGN KEY (borrow_order_code)
        REFERENCES borrowOrder (borrow_order_code)
);





