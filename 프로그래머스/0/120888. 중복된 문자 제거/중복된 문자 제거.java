import java.util.*;

class Solution {
    public String solution(String my_string) {
         LinkedHashSet<String> set = new LinkedHashSet<>();
        
        for(String s : my_string.split("")) {
            set.add(s);
        }
        
        return String.join("", set);
    }
}