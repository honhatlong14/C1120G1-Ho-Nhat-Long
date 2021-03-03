use classicmodels;
select * from customers where customerNumber=175;

explain select * from customers where customerNumber =175;

ALTER TABLE customers ADD INDEX idx_customerNumber(customerNumber);
explain select * from customers where customerNumber = 175;

alter table customers add index idx_full_name(contactFirstName, contactLastName);
explain select * from customers where contactFirstName = 'Jean' or contactLastName = 'King'