import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+ 1];
        int[] dp = new int[N+ 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        dp[1] = arr[1];

        for (int i = 2; i <= N; i++) {
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], arr[j] + dp[i-j]);
            }
        }
        System.out.println(dp[N]);
    }
}









