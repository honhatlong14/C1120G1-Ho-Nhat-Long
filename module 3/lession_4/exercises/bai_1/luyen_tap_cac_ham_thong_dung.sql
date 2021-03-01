drop database if exists lession_4;
create database lession_4;

use lession_4;
CREATE TABLE lession_4 (
    id INT PRIMARY KEY,
    ten VARCHAR(45) NOT NULL,
    tuoi VARCHAR(45) NOT NULL,
    khoa_hoc VARCHAR(45),
    so_tien INT
);

insert into lession_4
value
(1,'Hoang',21,'CNTT',400000),
(2,'Viet',19,'DTVN',320000),
(3,'Thanh',18,'KTDN',400000),
(4,'Nhan',19,'CK',450000),
(5,'Huong',20,'TCNH',500000),
(6,'Huong',20,'TCNH',200000);

SELECT 
    *
FROM
    lession_4
WHERE
    ten = 'Huong';

SELECT 
    id, ten, tuoi, khoa_hoc, so_tien, SUM(so_tien) AS tong_tien
FROM
    lession_4
WHERE
    ten = 'Huong';

SELECT DISTINCT
    id, ten, tuoi, khoa_hoc, so_tien
FROM
    lession_4;