-- 코드를 입력하세요
SELECT MAX(PRODUCT_ID)   as PRODUCT_ID
     , MAX(PRODUCT_NAME) as PRODUCT_NAME
     , MAX(PRODUCT_CD)   as PRODUCT_CD
     , MAX(CATEGORY)     as CATEGORY
     , MAX(PRICE)        as PRICE
  FROM FOOD_PRODUCT
 WHERE PRICE = (select max(price) as price
                  from food_product
            );