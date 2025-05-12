import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] time = new int[100001];
        boolean[] visited = new boolean[100001];

        queue.offer(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            int[] next = {current - 1, current + 1, current * 2};

            for (int i = 0; i < 3; i++) {
                int nextPosition = next[i];

                if (nextPosition >= 0 && nextPosition <= 100000 && !visited[nextPosition]) {
                    visited[nextPosition] = true;
                    time[nextPosition] = time[current] + 1;
                    queue.offer(nextPosition);

                    if (nextPosition == K) {
                        System.out.println(time[nextPosition]);
                        return;
                    }
                }
            }
        }
    }
}
