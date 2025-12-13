class Solution {
public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int cnt = 0;

        for (int x = Math.abs(a - b) + 1; x < a + b; x++) {
            cnt++;
        }
        return cnt;
    }
}