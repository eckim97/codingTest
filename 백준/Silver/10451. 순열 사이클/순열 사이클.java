import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] numbers;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            numbers = new int[N + 1];
            visited = new boolean[N + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;

            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    findCycle(i);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    static void findCycle(int current) {
        visited[current] = true;

        int next = numbers[current];

        if (!visited[next]) {
            findCycle(next);
        }
    }
}