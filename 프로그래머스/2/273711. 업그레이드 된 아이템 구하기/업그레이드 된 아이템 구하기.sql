select c.item_id, c.item_name, c.rarity
  from item_info a
  join item_tree b 
    on a.item_id = b.parent_item_id
  join item_info c
    on b.item_id = c.item_id
 where a.rarity = 'rare'
 order by c.item_id desc;