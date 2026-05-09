class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int nh = h + dh[d];
            int nw = w + dw[d];
            if (nh < 0 || nh >= n || nw < 0 || nw >= n) continue;
            if (board[nh][nw].equals(board[h][w])) count++;
        }

        return count;
    }
}