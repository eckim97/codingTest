class Solution {
    public int solution(int n, int w, int num) {
        int[][] warehouse = new int[(n + w - 1) / w][w];
        
        for (int i = 1; i <= n; i++) {
            int row = (i - 1) / w;
            int col;
            if (row % 2 == 0) {
                col = (i - 1) % w;
            } else {
                col = w - 1 - (i - 1) % w;
            }
            warehouse[row][col] = i;
        }

        int numRow = -1, numCol = -1;
        for (int r = 0; r < warehouse.length; r++) {
            for (int c = 0; c < w; c++) {
                if (warehouse[r][c] == num) {
                    numRow = r;
                    numCol = c;
                }
            }
        }

        int count = 0;
        for (int r = warehouse.length - 1; r >= numRow; r--) {
            if (warehouse[r][numCol] != 0) count++;
        }

        return count;
    }
}