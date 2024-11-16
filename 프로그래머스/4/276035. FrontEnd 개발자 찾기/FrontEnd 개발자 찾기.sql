select distinct a.id, a.email, a.first_name, a.last_name
  from developers a 
  join skillcodes b 
    on (a.skill_code & b.code) > 0
 where b.category = 'Front End'
 order by  a.id;

 