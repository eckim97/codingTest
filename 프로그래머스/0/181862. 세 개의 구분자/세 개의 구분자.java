import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]+");
        
        List<String> result = new ArrayList<>();
        for (String str : arr) {
            if (!str.isEmpty()) {
                result.add(str);
            }
        }
        
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}