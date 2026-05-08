class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int total = toSec(video_len);
        int cur = toSec(pos);
        int opS = toSec(op_start);
        int opE = toSec(op_end);

        if (cur >= opS && cur <= opE) cur = opE;

        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                cur = Math.max(0, cur - 10);
            } else {
                cur = Math.min(total, cur + 10);
            }
            if (cur >= opS && cur <= opE) cur = opE;
        }

        return toTime(cur);
    }

    int toSec(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    String toTime(int sec) {
        return String.format("%02d:%02d", sec / 60, sec % 60);
    }
}