-- 코드를 입력하세요
SELECT ROUND(AVG(daily_fee)) as AVERAGE_FEE
  from CAR_RENTAL_COMPANY_CAR
 where car_type = "suv";