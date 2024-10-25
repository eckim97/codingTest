-- 코드를 입력하세요
select a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, DATE_FORMAT(b.CREATED_DATE, '%Y-%m-%d') CREATED_DATE
  from used_goods_board a
  join used_goods_reply b
    on a.board_id = b.board_id
 where a.created_date like '%2022-10%' 
 order by b.created_date, a.title;