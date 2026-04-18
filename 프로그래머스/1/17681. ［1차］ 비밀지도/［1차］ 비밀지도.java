class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]))
                              .replace('0', ' ')
                              .replace('1', '#');
        }
        
        return result;
    }
}