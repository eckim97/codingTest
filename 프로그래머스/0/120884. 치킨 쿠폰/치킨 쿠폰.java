class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int service = coupon / 10;
            int remain = coupon % 10;

            answer += service;
            coupon = service + remain;
        }

        return answer;
    }
}
