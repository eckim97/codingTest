import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static long dcg(long a, long b) {
        while (true) {
            if (a < b) {
                long temp = a;
                a = b;
                b = temp;
            } else if (b > 1) {
                long nextA = b;
                long nextB = a / b;
                a = nextA;
                b = nextB;
            } else {
                return a;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long X = Long.parseLong(st.nextToken());
            long Y = Long.parseLong(st.nextToken());

            long k;

            if (X <= Y) {
                k = (Y + X - 1) / X;
            } else if (Y * Y >= X) {
                k = (Y * Y + X - 1) / X;
            } else {
                k = 1;

                while (dcg(k * X, Y) != Y) {
                    k++;
                }
            }

            long s = k * X;

            long a;
            long b = s;

            if (k == 1) {
                a = Y * s;
            } else {
                a = Y * s + X;
            }

            sb.append(a).append(" ").append(b).append("\n");
        }

        System.out.print(sb);
    }
}