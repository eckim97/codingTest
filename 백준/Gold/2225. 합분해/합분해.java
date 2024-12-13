import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = 1000000000;

        int[][] dp = new int[K + 1][N + 1];

        for(int i = 0; i <= K; i++) {
            dp[i][0] = 1;
        }

        for(int j = 0; j <= N; j++) {
            dp[1][j] = 1;
        }

        for(int i = 2; i <= K; i++) {
            for(int j = 1; j <= N; j++) {
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % mod;
            }
        }
        System.out.println(dp[K][N]);
    }
}




