select user_id, product_id
  from online_sale
 group by user_id, product_id
having count(sales_amount) >= 2
 order by user_id, product_id desc;