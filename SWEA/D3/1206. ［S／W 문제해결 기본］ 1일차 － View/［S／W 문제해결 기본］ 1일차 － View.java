import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int i = 2; i < N - 2; i++) {
                int maxLeft = Math.max(h[i-1], h[i-2]);
                int maxRight = Math.max(h[i+1], h[i+2]);
                int blocked = Math.max(maxLeft, maxRight);
                if (h[i] > blocked) {
                    count += h[i] - blocked;
                }
            }

            sb.append("#").append(test_case).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}