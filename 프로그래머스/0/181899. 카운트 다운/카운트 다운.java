import java.util.*; 
    
class Solution {
    public int[] solution(int start_num, int end_num) {
        int result = start_num - end_num+1;
        int[] answer = new int[result];
        
        for (int i = 0; i < result; i++){
            answer[i] = start_num - i;
        }
        return answer;
    }
}