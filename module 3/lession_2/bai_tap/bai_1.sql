create database bai_1;

use bai_1;
create table customers(
	customer_number int (255) not null auto_increment,
    fullname varchar (255) not null,
    address varchar(255) not null,
    email varchar(255) not null,
    phone varchar(255) not null,
	constraint customer_number_pk primary key(customer_number)
    
);
create table accounts(
account_number int(255) primary key auto_increment,
account_type varchar(255) not null,
account_date date,
balance int,
customer_number int unique,
foreign key(customer_number) references customers(customer_number)
);

create table transactions (
tran_number int (100)  primary key auto_increment,
account_numbers int (255) not null,
tran_date date,
amounts int,
descriptions varchar(255) not null,
account_number int,
foreign key(account_number) references accounts(account_number)
);