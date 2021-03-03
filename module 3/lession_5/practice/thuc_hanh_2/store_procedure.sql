use classicmodels;

DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //

DELIMITER ;

call findAllCustomers();
delimiter //
drop procedure if exists findAllCustomers;
create procedure findAllCustomers()
begin
select * from customers where customerNumber = 175;
end; //
delimiter //