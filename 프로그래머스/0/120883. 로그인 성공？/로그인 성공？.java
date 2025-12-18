import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map = new HashMap<>();
        
        for (int i = 0; i < db.length; i++){
            map.put(db[i][0], db[i][1]);
        }
        String id = id_pw[0];
        String pw = id_pw[1];
        
        if (!map.containsKey(id)){
            return "fail";
        }
        
        if (map.get(id).equals(pw)){
            return "login";
        }
        
        return "wrong pw";
        
        
    }
}