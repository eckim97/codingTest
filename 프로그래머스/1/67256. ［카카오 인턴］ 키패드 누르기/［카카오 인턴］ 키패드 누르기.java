class Solution {
    public String solution(int[] numbers, String hand) {
        int[] left = {3, 0};
        int[] right = {3, 2};
        StringBuilder sb = new StringBuilder();

        int[][] pos = {
            {3, 1}, {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2}, {2, 0},
            {2, 1}, {2, 2}
        };

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                left = pos[n];
                sb.append("L");
            } else if (n == 3 || n == 6 || n == 9) {
                right = pos[n];
                sb.append("R");
            } else {
                int leftDist = Math.abs(left[0] - pos[n][0]) + Math.abs(left[1] - pos[n][1]);
                int rightDist = Math.abs(right[0] - pos[n][0]) + Math.abs(right[1] - pos[n][1]);

                if (leftDist < rightDist || (leftDist == rightDist && hand.equals("left"))) {
                    left = pos[n];
                    sb.append("L");
                } else {
                    right = pos[n];
                    sb.append("R");
                }
            }
        }

        return sb.toString();
    }
}