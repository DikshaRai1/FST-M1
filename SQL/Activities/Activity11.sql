Activity11
1. SELECT customer_id, customer_name FROM customers c
WHERE 1<(SELECT COUNT(*) FROM orders o WHERE c.customer_id = o.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman s
WHERE 1<(SELECT COUNT(*) FROM orders o WHERE s.salesman_id = o.salesman_id)
ORDER BY customer_name;
2. SELECT s.salesman_id, salesman_name, order_no, 'highest on', order_date FROM salesman s, orders o
WHERE s.salesman_id=o.salesman_id
AND purchase_amount=(SELECT MAX(purchase_amount) FROM orders o1 WHERE o1.order_date = o.order_date)
UNION
SELECT s.salesman_id, salesman_name, order_no, 'lowest on', order_date FROM salesman s, orders o
WHERE s.salesman_id=o.salesman_id
AND purchase_amount=(SELECT MIN(purchase_amount) FROM orders o1 WHERE o1.order_date = o.order_date);

