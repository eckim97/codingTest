import java.io.*;
import java.util.*;

public class Main {

    static final boolean isLocal = true;
    static BufferedReader br;
    static StringTokenizer st;

    static int nextInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static void solve() throws Exception {
        int N = nextInt();

        for (int i = 1; i <= N; i++) {
            if (getSum(i) == N) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }

    static int getSum(int x) {
        int sum = x;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return sum;
    }
}