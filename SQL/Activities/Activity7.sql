REM   Script: Activity7
REM   aggregate functions using set of operators

select * from orders 
 
--to find the total purchase amount 
select sum(purchase_amount) from orders 
 
--To find the average of purchase amount 
select avg(purchase_amount) from orders 
 
--To find out the max of purchase amount 
Select Max(Purchase_amount) from orders 
 
--To find out the min of purchase amount 
Select Min(purchase_amount) from orders 
 
--To find out the number of salesmen listed in the table ;

select count(distinct salesman_id) from orders 
;

