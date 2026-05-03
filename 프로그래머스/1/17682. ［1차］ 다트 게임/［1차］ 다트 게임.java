class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = -1;
        int i = 0;

        while (i < dartResult.length()) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                int num = c - '0';
                if (i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    num = 10;
                    i++;
                }
                scores[++idx] = num;
            } else if (c == 'S') {
            } else if (c == 'D') {
                scores[idx] = (int) Math.pow(scores[idx], 2);
            } else if (c == 'T') {
                scores[idx] = (int) Math.pow(scores[idx], 3);
            } else if (c == '*') {
                scores[idx] *= 2;
                if (idx > 0) scores[idx - 1] *= 2;
            } else if (c == '#') {
                scores[idx] *= -1;
            }
            i++;
        }
        return scores[0] + scores[1] + scores[2];
    }
}