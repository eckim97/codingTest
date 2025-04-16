import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
    public int solution(int n) {
        
        int result = 0;
        int t = 0;

        if (n % 2 != 0) {
            t = 1;
        } else{
            t = 2;
        }

        for (int i = t; i <= n; i = i + 2) {
            if (i % 2 != 0){
                result += i;    
            } else{
                result += i * i;    
            }
        }
        return result;
    }
}