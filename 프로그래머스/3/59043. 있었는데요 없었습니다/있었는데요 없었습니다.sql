SELECT a.animal_id, a.name
  from animal_ins a 
  join animal_outs b 
    on a.animal_id = b.animal_id
 where a.dateTime > b.dateTime
 order by a.dateTime;