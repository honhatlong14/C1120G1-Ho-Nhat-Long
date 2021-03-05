drop database if exists furama_resort;
create database furama_resort;

use furama_resort;

CREATE TABLE location_employees (
    location_id INT PRIMARY KEY,
    location_name VARCHAR(45) NOT NULL
);

CREATE TABLE staff_qualifications (
    qualifications_id INT PRIMARY KEY,
    qualifications_name VARCHAR(45) NOT NULL
);

CREATE TABLE staff_department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(45) NOT NULL
);

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(45) NOT NULL,
    location_id INT NOT NULL,
    qualification_id INT NOT NULL,
    department_id INT NOT NULL,
    date_o_birth DATE NOT NULL,
    id_card VARCHAR(45) NOT NULL,
    salary VARCHAR(45) NOT NULL,
    phone VARCHAR(45) NOT NULL,
    email VARCHAR(45) UNIQUE NOT NULL,
    address VARCHAR(45) NOT NULL,
    FOREIGN KEY (location_id)
        REFERENCES location_employees (location_id),
    FOREIGN KEY (qualification_id)
        REFERENCES staff_qualifications (qualifications_id),
    FOREIGN KEY (department_id)
        REFERENCES staff_department (department_id)
);

CREATE TABLE type_of_customer (
    type_of_customer_id INT PRIMARY KEY,
    type_of_customer_name VARCHAR(45) NOT NULL
);

CREATE TABLE customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    type_id INT,
    customer_name VARCHAR(45) NOT NULL,
    date_of_birth DATE,
    id_card VARCHAR(45) UNIQUE NOT NULL,
    phone VARCHAR(45) NOT NULL,
    email VARCHAR(45) UNIQUE NOT NULL,
    address VARCHAR(45) NOT NULL,
    FOREIGN KEY (type_id)
        REFERENCES type_of_customer (type_of_customer_id)
);

CREATE TABLE type_rental (
    type_rental_id INT PRIMARY KEY,
    type_rental_name VARCHAR(45) NOT NULL,
    price INT
);

CREATE TABLE type_service (
    type_service_id INT PRIMARY KEY,
    type_service_name VARCHAR(45) NOT NULL
);

CREATE TABLE services (
    service_id INT PRIMARY KEY,
    service_name VARCHAR(45) NOT NULL,
    service_are INT,
    service_floor INT,
    max_number_of_people VARCHAR(45) NOT NULL,
    rental_costs VARCHAR(45) NOT NULL,
    type_rental_id INT NOT NULL,
    type_of_service_id INT NOT NULL,
    service_status VARCHAR(45) NOT NULL,
    FOREIGN KEY (type_rental_id)
        REFERENCES type_rental (type_rental_id),
    FOREIGN KEY (type_of_service_id)
        REFERENCES type_service (type_service_id)
);

CREATE TABLE contract (
    contract_id INT PRIMARY KEY,
    employee_id INT NOT NULL,
    customer_id INT NOT NULL,
    service_id INT NOT NULL,
    contracting_date DATE,
    end_date DATE,
    deposits INT NOT NULL,
    total_money INT NOT NULL,
    FOREIGN KEY (employee_id)
        REFERENCES employees (employee_id),
    FOREIGN KEY (customer_id)
        REFERENCES customers (customer_id),
    FOREIGN KEY (service_id)
        REFERENCES services (service_id)
);

CREATE TABLE accompanied_service (
    accompanied_service_id INT PRIMARY KEY,
    accompanied_service_name VARCHAR(45) NOT NULL,
    price INT NOT NULL,
    unit INT NOT NULL,
    availability VARCHAR(45) NOT NULL
);

CREATE TABLE contract_details (
    contract_detail_id INT PRIMARY KEY,
    contract_id INT NOT NULL,
    accompanied_service_id INT NOT NULL,
    amount INT NOT NULL,
    FOREIGN KEY (contract_id)
        REFERENCES contract (contract_id),
    FOREIGN KEY (accompanied_service_id)
        REFERENCES accompanied_service (accompanied_service_id)
);

-- --add table location_employees-- --
insert into location_employees
value
(1,'Giám đốc'),
(2,'Quản lí'),
(3,'Giám sát'),
(4,'Chuyên viên'),
(5,'Phục vụ'),
(6,'Lễ tân');

-- --add table staff_qualifications -- --
insert into staff_qualifications
value
(1, 'trung cấp'),
(2, 'cao đẳng'),
(3, 'đại học'),
(4, 'sau đại học');

-- -- add table staff_department-- --
insert into staff_department
value
(1,'Quản Lí'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Sale Marketing');

-- --add table employees-- --
insert into employees
value
(1,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho@gmail.com','Huế'),
(2,'Hồ Nhật quân',1,1,1,'1998-12-12','192235150',99000,'0356512362','longtromcho1@gmail.com','Đà Nẵng'),
(3,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho2@gmail.com','Quảng Nam'),
(4,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho3@gmail.com','Quảng Ngãi'),
(5,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho4@gmail.com','Bình Định'),
(6,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho5@gmail.com','Phú yên'),
(7,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho6@gmail.com','Quảng Bình'),
(8,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho7@gmail.com','Quảng Trị'),
(9,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho8@gmail.com','Hà Tĩnh'),
(10,'Hồ Nhật Long',1,1,1,'1999-12-12','192235501',90000,'0356501796','longtromcho9@gmail.com','Nghệ An');

-- -- add table type of customer -- --
insert into type_of_customer
value
(1,'Diamond'),
(2,'Platinum'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

-- -- add table customers -- --
insert into customers
value 
(1,1,'Hồ Nhật Long','1999-01-02','12236655','01669715120','nhatlong1212@gmail.com','Đà Nẵng'),
(2,2,'Hồ Nhật Long','1999-01-03','12236666','01669715120','nhatlong1213@gmail.com','Huế'),
(3,3,'Hồ Nhật Long','1999-01-04','12236657','01669715120','nhatlong1214@gmail.com','Quảng Trị'),
(4,4,'Hồ Nhật Long','1999-01-05','12236658','01669715120','nhatlong1215@gmail.com','Quảng Bình'),
(5,5,'Hồ Nhật Long','1999-01-06','12236659','01669715120','nhatlong1216@gmail.com','Quảng Nam'),
(6,2,'Hồ Nhật Long','1999-01-07','12236610','01669715120','nhatlong1217@gmail.com','Quảng Ngãi'),
(7,4,'Hồ Nhật Long','1999-01-08','12236611','01669715120','nhatlong1218@gmail.com','Bình Định');

-- -- add table accompanied service -- --
insert into accompanied_service
value
(1,'Message',300,2,'ABCDEF'),
(2,'Food',300,4,'ABCDEF'),
(3,'Drink',300,6,'ABCDEF'),
(4,'Rent-Car',300,3,'ABCDEF'),
(5,'Karaoke',700,5,'ABCDEF'),
(6, 'ABC',500,7,'ABCDEF');

-- -- add table type service -- --
insert into type_service
values
(1,'Villa'),
(2,'House'),
(3,'Room');

-- ---- add table rental type  ------
insert into type_rental
values
(1,'Day',500),
(2,'Week',3000),
(3,'Month',12500);

-- ---- add table services-----
insert into services
values
(1,'Villa-A',500,3,12,5000,2,1,'Còn Cho Thuê'),
(2,'Villa-B',500,3,12,5000,2,1,'Còn Cho Thuê'),
(3,'House-B',400,3,12,4000,3,2,'Còn Cho Thuê'),
(4,'House-A',400,3,12,3000,3,2,'Còn Cho Thuê'),
(5,'Room-A',300,3,12,2000,1,3,'Còn Cho Thuê'),
(6,'Room-B',300,3,12,2000,1,3,'Còn Cho Thuê');

-- ----add table contracts -----
insert into contract
values 
(1,2,3,4,'2019-2-3','2020-2-3',1000,15000),
(2,1,1,1,'2020-3-3','2020-2-3',1000,15000),
(3,1,1,1,'2019-4-3','2020-2-3',1000,15000),
(4,1,1,1,'2018-5-3','2020-2-3',1000,15000),
(5,1,1,1,'2021-7-3','2020-2-3',1000,15000),
(6,1,1,1,'2020-8-3','2020-2-3',1000,15000),
(7,1,1,1,'2018-9-3','2020-2-3',1000,15000),
(8,1,1,1,'2020-10-3','2020-2-3',1000,15000);

-- -- add table contract_details-- --
insert into contract_details
values
(1,1,2,6),
(2,2,3,2),
(3,3,6,2),
(4,4,6,5),
(5,5,3,3),
(6,1,6,5),
(7,3,2,3),
(8,4,4,4);











