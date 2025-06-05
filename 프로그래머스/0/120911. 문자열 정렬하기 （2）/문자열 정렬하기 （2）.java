import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tmp = my_string.toLowerCase().split("");
        
        Arrays.sort(tmp);
        
        for (int i = 0; i < tmp.length; i++){
            answer += tmp[i];
        }
        return answer;
    }
}