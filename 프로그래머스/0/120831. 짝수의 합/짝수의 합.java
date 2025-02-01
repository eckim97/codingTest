class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        int i = 2;

        while (i <= n) {

            sum += i;

            i = i + 2;
            cnt++;
        }
        answer = sum;
        return answer;
    }
}