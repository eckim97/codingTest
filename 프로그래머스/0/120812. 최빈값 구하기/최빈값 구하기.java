class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] cnt = new int[1001];

        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }

        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCount) {
                maxCount = cnt[i];
                max = i;
            }
        }

        int same = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == maxCount) {
                same++;
            }
        }

        if (same > 1) {
            return -1;
        }

        return max;
}
}