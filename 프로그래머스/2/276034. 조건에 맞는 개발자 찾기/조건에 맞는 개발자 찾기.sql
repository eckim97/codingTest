/* select *
  from skillcodes;*/
  
  select distinct a.id, a.email, a.first_name, a.last_name
    from developers a
    left join skillcodes b
      on (a.skill_code & b.code) = b.code
    where b.name in ('python', 'C#')
   order by a.id;