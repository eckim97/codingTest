import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] length = new int [31];
        
        for (String str : strArr){
            length[str.length()]++;
        }
        
        int MaxCount = 0;
        
        for (int count : length){
            MaxCount = Math.max(MaxCount, count);
        }
        
           return MaxCount;
    }
}