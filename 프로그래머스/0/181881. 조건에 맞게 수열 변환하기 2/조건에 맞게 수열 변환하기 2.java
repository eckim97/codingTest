import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        while (true) {
            int[] newArr = new int[arr.length];
            boolean changed = false;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                    changed = true;
                }
                else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                    changed = true;
                }
                else {
                    newArr[i] = arr[i];
                }
            }
            
            if (!changed) {
                break;
            }
            
            arr = newArr;
            count++;
        }
        
        return count;
    }
}