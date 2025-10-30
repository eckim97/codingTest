import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        if (before.length() != after.length()){
            return 0;
        }
        
        char beforeArr[] = before.toCharArray();
        char afterArr[] = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        if (Arrays.equals(beforeArr, afterArr)){
            answer = 1;
        } else{
            answer = 0;
        }
            
        return answer;
    }
}