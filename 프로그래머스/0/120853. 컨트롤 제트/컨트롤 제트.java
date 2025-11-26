import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = s.split(" ");
        
        for (String str : arr){
            if (str.equals("Z")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else{
              stack.push(Integer.parseInt(str));  
            }
        }
        
        int answer = 0;
        for (int num : stack){
            answer += num;
        }
        return answer;
    }
}