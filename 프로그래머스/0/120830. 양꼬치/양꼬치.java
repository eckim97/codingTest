class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int tmp = 0;
        if (n >= 10){
            tmp = n / 10;
            answer = (n * 12000) + (k * 2000) + (-tmp * 2000);
        } else {
            answer = (n * 12000) + (k * 2000);
        }
        return answer;
    }
}