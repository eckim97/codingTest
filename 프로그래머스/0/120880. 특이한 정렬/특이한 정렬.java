import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {

        Integer[] arr = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            arr[i] = numlist[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int aDist = Math.abs(a - n);
            int bDist = Math.abs(b - n);

            if (aDist != bDist) {
                return aDist - bDist;   
            }
            return b - a;              
        });

        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
