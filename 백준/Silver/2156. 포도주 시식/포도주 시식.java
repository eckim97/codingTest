import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] wine = new int[T+1];
        int[] dp = new int[T+1];

        for (int j = 1; j <= T; j++) {
            wine[j] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1];

        if (T > 1) {
            dp[2] = wine[1] + wine[2];
        }

        for (int j = 3; j <= T; j++) {
            dp[j] = Math.max(Math.max(dp[j-3] + wine[j-1] + wine[j], dp[j-2] + wine[j]), dp[j-1]);
        }
        System.out.println(dp[T]);
    }
}
