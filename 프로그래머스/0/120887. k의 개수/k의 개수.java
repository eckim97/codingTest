class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            String kStr = String.valueOf(k);
            
            for (int idx = 0; idx < numStr.length(); idx++) {
                if (numStr.charAt(idx) == kStr.charAt(0)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}