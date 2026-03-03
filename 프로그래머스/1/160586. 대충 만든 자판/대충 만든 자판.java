import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> minPress = new HashMap<>();
        
        for (String key : keymap) {
            for (int idx = 0; idx < key.length(); idx++) {
                char ch = key.charAt(idx);
                int press = idx + 1; 
                
                Integer currentMin = minPress.get(ch);
                if (currentMin == null || press < currentMin) {
                    minPress.put(ch, press);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int total = 0;
            boolean possible = true;
            
            for (char ch : targets[i].toCharArray()) {
                Integer press = minPress.get(ch);
                if (press != null) {
                    total += press;
                } else {
                    possible = false;
                    break;
                }
            }
            
            answer[i] = possible ? total : -1;
        }
        
        return answer;
    }
}
