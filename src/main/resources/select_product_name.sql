select product_name
from hw_netology.ORDERS
    join hw_netology.CUSTOMERS on hw_netology.ORDERS.customer_id = customers.id
where lower(customers.name) = lower(:name)