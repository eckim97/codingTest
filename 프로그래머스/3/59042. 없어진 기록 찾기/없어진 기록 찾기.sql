select a.animal_id, a.name 
  from animal_outs a 
  left outer join animal_ins b 
    on a.animal_id = b.animal_id 
 where b.animal_id is null