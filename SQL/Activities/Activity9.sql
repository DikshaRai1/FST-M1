Activity9

create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

insert all 
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values(3007, 'Brad Davis', 'New York', 200, 5001)
into customers values(3005, 'Graham Zusi', 'California', 200, 5002)
into customers values(3008, 'Julian Green', 'London', 300, 5002)
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers values(3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL

1. select customer_id, customer_name,salesman_name from customers,salesman where customers.salesman_id=salesman.salesman_id;
2. SELECT customer_name, city, c.grade, salesman_name , salesman_city FROM customers c
LEFT OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300 
ORDER BY customer_id;
3. SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;
4. SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;