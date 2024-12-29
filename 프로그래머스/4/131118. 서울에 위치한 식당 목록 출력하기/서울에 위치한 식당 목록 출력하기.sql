SELECT a.rest_id, a.rest_name, a.food_type, a.favorites, a.address, round(avg(b.review_score),2) as score
  FROM REST_INFO a
  JOIN REST_REVIEW b
    ON a.rest_id = b.rest_id
 where a.address like '서울%'
 group by a.rest_id, a.rest_name, a.food_type, a.favorites, a.address
 order by score desc, a.favorites desc;
  
