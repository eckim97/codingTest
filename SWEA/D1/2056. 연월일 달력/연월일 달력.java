import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int tc = 1; tc <= T; tc++) {
            String date = br.readLine().trim();

            String year = date.substring(0, 4);
            String monthStr = date.substring(4, 6);
            String dayStr = date.substring(6, 8);

            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);

            sb.append("#").append(tc).append(" ");

            if (month < 1 || month > 12) {
                sb.append("-1\n");
            } else if (day < 1 || day > days[month]) {
                sb.append("-1\n");
            } else {
                sb.append(year)
                  .append("/")
                  .append(monthStr)
                  .append("/")
                  .append(dayStr)
                  .append("\n");
            }
        }

        System.out.print(sb);
    }
}