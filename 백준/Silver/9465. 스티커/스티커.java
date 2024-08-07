import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int[][] stiker = new int[2][N + 1];
            int[][] dp = new int[2][N + 1];

            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int jj = 1; jj <= N; jj++) {
                    stiker[j][jj] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = stiker[0][1];
            dp[1][1] = stiker[1][1];

            for (int k = 2; k <= N; k++) {
                dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + stiker[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + stiker[1][k];
            }

            System.out.println(Math.max(dp[0][N], dp[1][N]));
        }
    }
}


