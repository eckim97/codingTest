import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] rect;
    static long[][] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        rect = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                rect[i][j] = line.charAt(j) - '0';
            }
        }

        sum = new long[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + rect[i - 1][j - 1];
            }
        }

        long result = 0;

        for (int i = 1; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                long r1 = getSum(0, 0, N - 1, i - 1);
                long r2 = getSum(0, i, N - 1, j - 1);
                long r3 = getSum(0, j, N - 1, M - 1);
                result = Math.max(result, r1 * r2 * r3);
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                long r1 = getSum(0, 0, i - 1, M - 1);
                long r2 = getSum(i, 0, j - 1, M - 1);
                long r3 = getSum(j, 0, N - 1, M - 1);
                result = Math.max(result, r1 * r2 * r3);
            }
        }

        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                long r1 = getSum(0, 0, N - 1, i - 1);
                long r2 = getSum(0, i, j - 1, M - 1);
                long r3 = getSum(j, i, N - 1, M - 1);
                result = Math.max(result, r1 * r2 * r3);
            }
        }

        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                long r1 = getSum(0, 0, j - 1, i - 1);
                long r2 = getSum(j, 0, N - 1, i - 1);
                long r3 = getSum(0, i, N - 1, M - 1);
                result = Math.max(result, r1 * r2 * r3);
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                long r1 = getSum(0, 0, i - 1, M - 1);
                long r2 = getSum(i, 0, N - 1, j - 1);
                long r3 = getSum(i, j, N - 1, M - 1);
                result = Math.max(result, r1 * r2 * r3);
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                long r1 = getSum(0, 0, i - 1, j - 1);
                long r2 = getSum(0, j, i - 1, M - 1);
                long r3 = getSum(i, 0, N - 1, M - 1);
                result = Math.max(result, r1 * r2 * r3);
            }
        }

        System.out.println(result);
    }

    private static long getSum(int r1, int c1, int r2, int c2) {
        return sum[r2 + 1][c2 + 1] - sum[r2 + 1][c1] - sum[r1][c2 + 1] + sum[r1][c1];
    }
}