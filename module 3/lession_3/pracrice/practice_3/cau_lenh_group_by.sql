use classicmodels;

/*hiển thị các trạng thái khác nhau của đơn hàng.*/
select status from orders
group by status;

/*Bài toán đặt ra như sau muốn biết có bao nhiêu đơn đặt hàng trong mỗi trạng thái, 
chúng ta có thể sử dụng hàm COUNT với mệnh đề GROUP BY như sau:*/
select status, COUNT(*) as 'So luong status'
from orders
group by status;

/* nối 2 bảng và sử dụng hàm sum để tính tổng số tiền, nhóm theo trường status*/
select status, sum(quantityOrdered * priceEach) as amount
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
group by status;

/*Một yêu cầu khác là tính tổng tiền của từng đơn hàng*/
select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;

/*tổng doanh thu của những năm lớn hơn năm 2003.*/
select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;