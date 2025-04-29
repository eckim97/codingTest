class Solution {
    public int solution(int a, int b, int c) {
        int one = a + b + c;
        int two = a * a + b * b + c * c;
        int three = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            return one * two * three;
        } else if (a == b || b == c || a == c) {
            return one * two;
        } else {
            return one;
        }
    }
}
