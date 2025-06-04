import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String start = "";
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                start += st.nextToken();
            }
        }

        String target = "123456780";

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        if (start.equals(target)) {
            System.out.println(0);
            return;
        }

        queue.offer(start);
        visited.add(start);
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            moves++;

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                int zeroPos = current.indexOf('0');
                int row = zeroPos / 3;
                int col = zeroPos % 3;

                int[] dr = {-1, 1, 0, 0};
                int[] dc = {0, 0, -1, 1};

                for (int dir = 0; dir < 4; dir++) {
                    int newRow = row + dr[dir];
                    int newCol = col + dc[dir];

                    if (newRow < 0 || newRow >= 3 || newCol < 0 || newCol >= 3) {
                        continue;
                    }

                    int newPos = newRow * 3 + newCol;

                    String next = swap(current, zeroPos, newPos);

                    if (next.equals(target)) {
                        System.out.println(moves);
                        return;
                    }

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
        }

        System.out.println(-1);
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
