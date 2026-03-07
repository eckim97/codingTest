class Solution {
    public int solution(int[] numbers) {
        
        int totalSum = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        
        int arraySum = 0;
        for (int num : numbers){
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
}