REM   Script: Activity8
REM   aggregate operations using group by

select  customer_id, Max(purchase_amount) from orders group by customer_id;

select salesman_id, max(purchase_amount), order_Date from orders where order_Date = TO_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id, order_Date;

select * from orders;

select customer_id,  order_Date,max(purchase_amount)  from orders  group by customer_id, order_DAte having max(purchase_amount) in (2030, 3450, 5760, 6000)  
;

