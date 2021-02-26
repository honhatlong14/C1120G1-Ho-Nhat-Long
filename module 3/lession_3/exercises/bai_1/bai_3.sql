create database thu_vien;
use thu_vien;

create table BOOK(
ma_sach int(200) not null auto_increment,
ten_sach varchar(100) not null,
nha_san_xuat varchar(100) not null,
tac_gia varchar(100) not null,
nam_san_xuat date,
so_lan_xuat_ban int(100) not null,
gia int(255) not null,
anh varchar(200) not null,
constraint ma_sach_pk primary key(ma_sach)
);

create table STUDENT(
	student_number varchar(15) not null auto_increment,
    student_name varchar(50) not null,
    address varchar (500) not null,
    email varchar(50) not null,
    image 
);