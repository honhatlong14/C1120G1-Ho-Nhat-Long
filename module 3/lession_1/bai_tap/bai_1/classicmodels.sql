use classicmodels;

select * from customers;

select customerName, phone, city, country from customers;

select * from customers
	where customerName = 'Atelier Graphique';
select * from customers 
	where customername like '%A%';
select * from customers 
	where city in ('Nantes','Las Vegas','Warszawa','NYC');
