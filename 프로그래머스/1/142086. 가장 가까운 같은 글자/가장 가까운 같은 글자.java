import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndex = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (lastIndex.containsKey(c)) {
                answer[i] = i - lastIndex.get(c);
            } else {
                answer[i] = -1;
            }
            
            lastIndex.put(c, i);
        }
        
        return answer;
    }
}