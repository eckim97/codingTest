SELECT car_id, round(AVG(DATEDIFF(END_DATE, START_DATE)+1),1) AS average_duration
FROM car_rental_company_rental_history
GROUP BY car_id
HAVING AVERAGE_DURATION >= 7

 order by round(AVG(DATEDIFF(END_DATE, START_DATE)+1),1) desc, car_id desc