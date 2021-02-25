create database lession_2;
use lession_2;
create table contacts
( contact_id int(11) not null auto_increment,
  last_name varchar(30) not null,
  firt_name varchar(25),
  birthday date,
constraint contacts_pk primary key (contact_id)
);
create table suppliers(
suppliers_id int (11) not null auto_increment,
suppliers_name varchar(30) not null,
suppliers_rep varchar(50) not null default 'TBD',
constraint suppliers_pk primary key (suppliers_id)
);

create table users(
user_id int auto_increment primary key,
username varchar(40),
passwork varchar(255),
email varchar(255)
);

create table roles(
role_id int auto_increment,
role_name varchar (50),
primary key(role_id)
);









