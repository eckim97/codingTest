import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int n : arr) {
            if (!stack.isEmpty() && stack.peek() == n) {
                stack.pop(); 
            } else {
                stack.push(n);
            }
        }
        
        if (stack.isEmpty()) return new int[]{-1};
        
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
