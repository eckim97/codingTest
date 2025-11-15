import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            rankMap.put(sorted[n - 1 - i], i + 1);
        }
        
        for (int i = 0; i < n; i++){
            answer[i] = rankMap.get(emergency[i]);
        }
        
        
        return answer;
    }
}