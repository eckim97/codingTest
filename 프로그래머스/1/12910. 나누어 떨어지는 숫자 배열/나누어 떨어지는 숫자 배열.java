import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }
        
        if (count == 0) {
            return new int[] {-1};
        }
        
        int[] answer = new int[count];
        int idx = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                answer[idx++] = num;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}