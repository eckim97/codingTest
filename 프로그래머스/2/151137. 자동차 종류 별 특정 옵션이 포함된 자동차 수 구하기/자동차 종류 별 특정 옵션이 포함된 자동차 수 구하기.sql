-- 코드를 입력하세요
SELECT CAR_TYPE, count(car_id) as cars
  from car_rental_company_car 
 where options LIKE '%통풍시트%'
   or options LIKE '%열선시트%'
   or options LIKE '%가죽시트%'
 group by CAR_TYPE
 order by CAR_TYPE;