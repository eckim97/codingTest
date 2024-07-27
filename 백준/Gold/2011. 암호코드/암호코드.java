import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] dp = new int[str.length() + 1];
        dp[0] = 1;

        for (int i = 1; i <= str.length(); i++) {
            int one = str.charAt(i - 1) - '0';
            if (one >= 1 && one <= 9) {
                dp[i] = (dp[i] + dp[i -1]) % 1000000;
            }

            if (i > 1) {
                int two = (str.charAt(i-2) - '0') * 10 + one;
                if (two >= 10 && two <= 26){
                    dp[i] = (dp[i] + dp[i-2]) % 1000000;
                }
            }
        }
        System.out.println(dp[str.length()]);
    }
}




