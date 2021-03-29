drop database if exists phong_tro;
Create Database phong_tro;
use phong_tro;

create table phong_tro(
id_phong_tro int primary key auto_increment,
ten_nguoi_thue varchar(45),
so_dien_thoai varchar(45),
ngay_thue varchar(45),
hinh_thuc_thanh_toan varchar(45)
);

create table nguoi_thue_tro(
id_nguoi_thue int primary key,
ten_nguoi_thue varchar(45),
hinh_thuc_thanh_toan varchar(45)
);

create table hinh_thuc_thanh_toan(
id_hinh_thuc_thanh_toan int primary key,
id_phong_tro int,
id_nguoi_thue int,
thanh_toan_theo_thang varchar(45),
thanh_toan_theo_quy varchar(45),
thanh_toan_theo_nam varchar(45),

foreign key(id_phong_tro) references phong_tro(id_phong_tro),
foreign key(id_nguoi_thue) references nguoi_thue_tro(id_nguoi_thue)
);

INSERT INTO `phong_tro`.`phong_tro` (`id_phong_tro`, `ten_nguoi_thue`, `so_dien_thoai`, `ngay_thue`,`hinh_thuc_thanh_toan`) VALUES ('1', 'long', '0356502589', '20-02-2020', 'tien mat');
INSERT INTO `phong_tro`.`phong_tro` (`id_phong_tro`, `ten_nguoi_thue`, `so_dien_thoai`, `ngay_thue`,`hinh_thuc_thanh_toan`) VALUES ('2', 'long', '0356502589', '20-02-2020', 'tien mat');
INSERT INTO `phong_tro`.`phong_tro` (`id_phong_tro`, `ten_nguoi_thue`, `so_dien_thoai`, `ngay_thue`,`hinh_thuc_thanh_toan`) VALUES ('3', 'long', '0356502589', '20-02-2020', 'tien mat');
INSERT INTO `phong_tro`.`phong_tro` (`id_phong_tro`, `ten_nguoi_thue`, `so_dien_thoai`, `ngay_thue`,`hinh_thuc_thanh_toan`) VALUES ('4', 'long', '0356502589', '20-02-2020', 'tien mat');



delimiter $$
create procedure select_all()
begin
	
end ;
delimiter :
