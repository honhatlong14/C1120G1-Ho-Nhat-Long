use furama_resort;
-- ---- task 2-- ----
-- --2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.-- --
select * from employees where (
employee_name like 'H%' 
or employee_name like 'T%' 
or employee_name like 'K%')
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

select service_id,service_name,service_are,max_number_of_people,rental_costs,type_service.type_service_name
from services
join type_service on services.type_of_service_id = type_service.type_service_id
where not exists(
select contract.service_id from contract where(contract.contracting_date between'2018-01-01' and '2018-12-31')
);
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
 where year(contract.contracting_date) = '2020'
 group by 'month';

-- task 10
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, 
-- NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select contract.contract_id,contract.contracting_date,contract.end_date,contract.deposits, count(contract_detail_id) as number_of_services_included
from contract
join contract_details on contract.contract_id = contract_details.contract_id
group by contract_details.contract_detail_id;

-- task 11
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách 
-- hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select  
 acs.accompanied_service_id,
 acs.accompanied_service_name,
 acs.price,
 acs.availability,
 c.customer_id,
 toc.type_of_customer_id

from customers c
join type_of_customer toc on c.type_id = toc.type_of_customer_id
join contract con on c.customer_id = con.customer_id
join contract_details ct on con.contract_id = ct.contract_id
join accompanied_service acs on ct.accompanied_service_id = acs.accompanied_service_id
where c.type_id = 1 and c.address = 'Quảng Ngãi' ;

-- task 12
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng 
-- cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select
c.contract_id,
e.employee_name,
cus.customer_name,
cus.phone,
ser.service_name,
count(cd.contract_detail_id) as number_of_services_included,
c.deposits
from contract c
join employees e on c.employee_id = e.employee_id
join customers cus on c.customer_id = cus.customer_id
join services ser on c.service_id = ser.service_id
join contract_details cd on c.contract_id = cd.contract_id
join accompanied_service acs on cd.accompanied_service_id = acs.accompanied_service_id
where not exists(
select c.deposits from contract where(ser.service_id between '2019-07-01' and '2019-12-31'))
group by ser.service_id;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách 
-- hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
-- select *
-- from accompanied_service acs
-- join contract_details ct on acs.accompanied_service_id = ct.accompanied_service_id
-- join contract con on ct.contract_id = con.contract_id
-- join customers cus on con.customer_id = cus.customer_id
-- group by ct.accompanied_service_id
-- having sum(contract_details.amount);

 select a.accompanied_service_id , a.accompanied_service_name , a.price , a.unit , a.availability , count(a.accompanied_service_id) as amount_booking
 from accompanied_service a
 inner join contract_details c on c.accompanied_service_id = a.accompanied_service_id
 group by a.accompanied_service_id
 order by amount_booking desc;
SELECT 
    accompanied_service.accompanied_service_id,
    accompanied_service.accompanied_service_name,
    accompanied_service.price,
    accompanied_service.unit,
    accompanied_service.availability,
    count(accompanied_service.accompanied_service_id) as amount_total
FROM
    contract_details
        INNER JOIN
    accompanied_service ON accompanied_service.accompanied_service_id = contract_details.accompanied_service_id
GROUP BY accompanied_service.accompanied_service_id
HAVING SUM(contract_details.amount) = (SELECT 
        MAX(total)
    FROM
        (SELECT 
            SUM(contract_details.amount) AS total
        FROM
            contract_details
        GROUP BY accompanied_service_id) AS total);

-- task 14
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.



SELECT 
    contract.contract_id,
    accompanied_service.accompanied_service_id,
    accompanied_service.accompanied_service_name,
    COUNT(contract_details.accompanied_service_id) AS `number_using`
FROM
    accompanied_service
        JOIN
    contract_details ON contract_details.accompanied_service_id = accompanied_service.accompanied_service_id
        JOIN
    contract ON contract.contract_id = contract_details.contract_id
GROUP BY accompanied_service.accompanied_service_id
HAVING `number_using` = 1;

-- 15 Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi
-- -- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

SELECT 
    employees.employee_id,
    employees.employee_name,
    staff_qualifications.qualifications_id,
    location_employees.location_name,
    employees.phone,
    employees.address
FROM
    employees
        LEFT JOIN
    staff_qualifications ON staff_qualifications.qualifications_id = employees.qualification_id
        LEFT JOIN
    location_employees ON location_employees.location_id = employees.location_id
        LEFT JOIN
    contract ON contract.employee_id = employees.employee_id
WHERE
    YEAR(contract.contracting_date) BETWEEN 2018 AND 2019
GROUP BY employees.employee_id
HAVING COUNT(contract.contract_id) <= 3;



