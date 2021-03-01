-- ---- task 2-- ----
select * from employees where (
employee_name like '% % h %' 
or employee_name like '% % t %' 
or employee_name like '% % k %')
and char_length(employee_name) <=15;

-- ---- task 3-- ------
select * from customers where(
datediff(now(), date_of_birth)>6574
and datediff(now(), date_of_birth)<=18263)
and customers.address in ('Đà Nẵng','Quảng Trị'); 