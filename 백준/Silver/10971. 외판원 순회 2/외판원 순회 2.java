import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   static int N;
   static int[][] W;
   static boolean[] visited;
   static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        W = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            visited = new boolean[N];
            visited[i] = true;
            dfs(i, i, 0, 1);
        }

        System.out.println(answer);
    }

    public static void dfs(int start, int current, int cost, int count) {
        if (count == N) {
            if (W[current][start] != 0) {
                int totalCost = cost + W[current][start];
                answer = Math.min(answer, totalCost);
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i] && W[current][i] != 0) {
                visited[i] = true;
                dfs(start, i, cost + W[current][i], count + 1);
                visited[i] = false;
            }
        }
    }
}
