drop database if exists lession_5;
create database lession_5;

use lession_5;
create table products(
id int primary key,
product_code varchar(45) not null,
product_name varchar(45) not null,
product_price varchar(45) not null,
product_amount varchar(45) not null,
product_description varchar(45) not null,
product_status varchar(45) not null
);

insert into products 
value
(1,'1233','long','10000','10','tốt','hoạt động'),
(2,'1234','long1','20000','20','tốt','hoạt động'),
(3,'1235','long2','30000','40','tốt','hoạt động'),
(4,'1236','long3','40000','50','tốt','hoạt động'),
(5,'1237','long4','50000','30','tốt','hoạt động'),
(6,'1238','long5','10000','10','tốt','hoạt động');

-- task 1
create unique index products_code
on products(product_code);
select * from products use index (products_code) where product_code = 1233;

create index product_name
on products(product_name,product_price);

explain select product_name
from products;
explain select product_price
from products;

select * from products
where product_name = 'long';

-- task2 productCode, productName, productPrice, productStatus từ bảng products.

create view product_views as 
select product_code, product_name,product_price,product_status
from products;

select * from product_views;

update product_views
set product_name = 'quan'
where product_code = '1234';

select * from product_views;

drop view product_views;

-- task 3
-- ---Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product --- ---
delimiter //
create procedure select_product()
begin
select * from products;
end //
delimiter ;

call select_product();

-- -- Tạo store procedure thêm một sản phẩm mới-- -- 
delimiter //
create procedure add_product(id int ,product_code varchar(45),product_name varchar(45),product_price varchar(45),
product_amount varchar(45),product_description varchar(45),product_status varchar(45))
begin
insert into products
value(id,product_code,product_name,product_price,product_amount,product_description,product_status);
end //
delimiter ;

call add_product(7,'9999','iphone','22222','20','tốt','hoạt động');

select * from products;

-- --Tạo store procedure sửa thông tin sản phẩm theo id-- -- 
delimiter //
create procedure edit_product(id_in int ,product_code_in varchar(45),product_name_in varchar(45),product_price_in varchar(45),
product_amount_in varchar(45),product_description_in varchar(45),product_status_in varchar(45))
begin
update products
set product_code = product_code_in, product_name = product_name_in,product_price=product_price_in, product_amount = product_amount_in,
 product_description = product_description_in, product_status =product_status_in
 where id = id_in;
 end //
delimiter ;
SET SQL_SAFE_UPDATES = 0;
call edit_product(6,'1238','samsung','33333','20','tốt','hoạt động');
select * from products;

-- Tạo store procedure xoá sản phẩm theo id--- --
delimiter //
create procedure delete_product(id_in int)
begin 
delete from products
where id = id_in;
end; //
delimiter ;

call delete_product(1);

select * from products;









