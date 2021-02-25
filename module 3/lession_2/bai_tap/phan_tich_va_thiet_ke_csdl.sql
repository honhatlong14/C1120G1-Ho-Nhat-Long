create database phan_tich_va_thiet_ke_csdl;

use phan_tich_va_thiet_ke_csdl;

create table products_line(
product_line int(255) primary key,
product_description varchar(500) not null,
image varchar(50)
);

create table products(
product_code int(255) primary key,
product_name varchar(100) not null,
production varchar(100),
product_amount int(255),
import_price int(255),
price int(255),
product_line int,
foreign key(product_line) references products_line(product_line)
);

create table offices(
office_code int(255) primary key,
office_address varchar(500),
office_phone int(255),
conutry varchar(200),
employees_code int
);

create table employees(
employees_code int primary key,
employees_name varchar(15) not null,
employees_mail varchar(45) unicode not null,
job_name varchar(155) not null,
office_code int not null,
foreign key(office_code) references offices(office_code)
);

create table customers(
customer_number int primary key,
customer_name varchar(45),
customer_phone varchar(11),
customer_address varchar(11),
employees_code int,
foreign key(employees_code) references employees(employees_code)
);

create table orders(
order_number int(255) primary key,
date_of_purchase date,
date_of_deliver date,
actual_deliver date,
number_of_orders int (255),
unit_price int(255),
customer_number int,
foreign key(customer_number) references customers(customer_number)
);


create table payments(
payment_code int(255) primary key,
date_of_payment date,
total_money int(255),
customer_number int,
foreign key(customer_number) references customers(cutomer_number)
);

create table order_details (
    order_number int,
    product_code varchar(15),
    primary key (order_number , product_code),
    foreign key (order_number) references orders (order_number),
    foreign key (product_code) references products (product_code)
);