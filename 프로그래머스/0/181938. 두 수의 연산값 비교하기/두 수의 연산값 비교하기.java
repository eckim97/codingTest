class Solution {
    public int solution(int a, int b) {
        int concat = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int multiply = 2 * a * b;
        
        return Math.max(concat, multiply);
    }
}