import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= TC; tc++) {
            String line;

            while ((line = br.readLine()) != null && line.trim().isEmpty()) {}

            int N = Integer.parseInt(line.trim());

            int[] x = new int[N];
            int[] y = new int[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                x[i] = Integer.parseInt(st.nextToken());
                y[i] = Integer.parseInt(st.nextToken());
            }

            int answer = 0;

            for (int i = 0; i < N; i++) {
                int maxWidth = 0;
                int maxHeight = 0;

                for (int j = 0; j < N; j++) {
                    if (i == j) continue;

                    if (y[i] == y[j]) {
                        maxWidth = Math.max(maxWidth, Math.abs(x[i] - x[j]));
                    }

                    if (x[i] == x[j]) {
                        maxHeight = Math.max(maxHeight, Math.abs(y[i] - y[j]));
                    }
                }

                answer = Math.max(answer, maxWidth * maxHeight);
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}