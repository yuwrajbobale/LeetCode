# Write your MySQL query statement below
select
 customer_number 
from
 (select customer_number, count(order_number) order_count 
  from orders group by customer_number) a 
order by order_count desc limit 1