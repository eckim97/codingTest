class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int count = 0;

        for (int i = 0; i < schedules.length; i++) {
            int limit = addMinutes(schedules[i], 10);
            boolean pass = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;
                if (day == 6 || day == 7) continue;

                if (timelogs[i][j] > limit) {
                    pass = false;
                    break;
                }
            }

            if (pass) count++;
        }

        return count;
    }

    int addMinutes(int time, int min) {
        int h = time / 100;
        int m = time % 100 + min;
        if (m >= 60) {
            h++;
            m -= 60;
        }
        return h * 100 + m;
    }
}