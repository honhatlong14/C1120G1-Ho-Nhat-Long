drop database if exists benh_vien;
create database benh_vien;
use benh_vien;
create table benh_nhan (
ma_benh_nhan varchar(45) primary key,
ten_benh_nhan varchar(45),
ngay_nhap_vien varchar(45),
ngay_ra_vien varchar(45),
ly_do_nhap_vien varchar(45)
);
create table benh_an (
ma_benh_an varchar(45) primary key,
ma_benh_nhan varchar(45),
phuong_phap_dieu_tri varchar(45),
bac_si_dieu_tri varchar(45),
foreign key (ma_benh_nhan) references benh_nhan(ma_benh_nhan)
);
insert into benh_nhan values ('bn-001', 'bao', '09/09/2020', '10/10/2020', 'sot');
insert into benh_an values ('ba-001', 'bn-001', 'mo', 'le van b');