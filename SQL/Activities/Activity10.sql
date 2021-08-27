Activity10
1. select * from orders where salesman_id=(select salesman_id from orders where customer_id=3007);
2. select * from orders where salesman_id IN(select salesman_id from salesman where city='New York');
3. select count(customer_id) from customers where grade> (select avg(grade) from customers where city='New York');
4. select * from orders where salesman_id=(select salesman_id from salesman where commission=(select max(commission) from salesman));

