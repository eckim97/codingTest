class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        int bw = bill[0], bh = bill[1];
        int wMin = Math.min(wallet[0], wallet[1]);
        int wMax = Math.max(wallet[0], wallet[1]);

        while (Math.min(bw, bh) > wMin || Math.max(bw, bh) > wMax) {
            if (bw >= bh) {
                bw /= 2;
            } else {
                bh /= 2;
            }
            count++;
        }

        return count;
    }
}