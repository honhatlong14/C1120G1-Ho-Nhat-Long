use furama_resort;
-- ---- task 2-- ----
-- --2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.-- --
select * from employees where (
employee_name like '%%L %' 
or employee_name like '%%t %' 
or employee_name like '%%k %')
and char_length(employee_name) <=15;

-- ---- task 3	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.-- ------
select * from customers where
round(datediff(curdate(),date_of_birth)/365,0) between 18 and 50
and address in ('Đà Nẵng','Quảng Trị'); 
-- ----- task 4 -- ------
/*4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.*/
select customers.customer_name, count(contract_id) as number_of_reservations
from customers
left join contract on customers.customer_id = contract.customer_id
where customers.type_id =1
group by customer_name
order by count(contract_id);

-- -----task5 -- ----
/* 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
(Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).*/

select customers.customer_id,customers.customer_name,type_of_customer.type_of_customer_name,contract.contract_id,contract.contracting_date,contract.end_date,
(services.rental_costs + accompanied_service.unit*accompanied_service.price) as total_money
from customers
left join contract on customers.customer_id = contract.customer_id
left join type_of_customer on customers.type_id =type_of_customer.type_of_customer_id
left join services on services.service_id = contract.contract_id
left join contract_details on contract.contract_id = contract_details.contract_id
left join accompanied_service on contract_details.accompanied_service_id = accompanied_service.accompanied_service_id;
-- group by contract.contract_id order by customers.customer_id;

-- ---task 6 -- -----
/*6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại 
Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).*/
 select services.service_id,services.service_name,
 services.service_are,services.rental_costs, type_service.type_service_name
 from services
 join type_service on services.type_of_service_id = type_service.type_service_id
 where not exists(
 select contract.service_id from contract where(contract.contracting_date between'2019-01-01' and '2019-03-31')
 and contract.service_id = services.service_id
 );
-- -- task7 -- ---
/*7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại 
dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.*/

-- task8
/*8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên*/

-- case 1
select * from customers
group by customer_name;
-- case 2
select distinct customer_name from customers;
-- case 3
select customer_name from customers
union
select customer_name
from customers;

-- ---- task9 -- ----
/*9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng
 trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.*/
 select month(contract.contracting_date), count(contract.contracting_date) as number_of_reservations
 from contract
 where year(contract.contracting_date) = '2019'
 group by 'month';





