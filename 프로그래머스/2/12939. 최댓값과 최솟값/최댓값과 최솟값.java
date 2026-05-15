class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (String x : arr) {
            int n = Integer.parseInt(x);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return min + " " + max;
    }
}