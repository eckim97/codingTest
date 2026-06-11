import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            int testCaseNumber = Integer.parseInt(br.readLine().trim());

            int[] count = new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                count[score]++;
            }

            int maxCount = 0;
            int answer = 0;

            for (int score = 0; score <= 100; score++) {
                if (count[score] >= maxCount) {
                    maxCount = count[score];
                    answer = score;
                }
            }

            sb.append("#")
              .append(testCaseNumber)
              .append(" ")
              .append(answer)
              .append("\n");
        }

        System.out.print(sb);
    }
}