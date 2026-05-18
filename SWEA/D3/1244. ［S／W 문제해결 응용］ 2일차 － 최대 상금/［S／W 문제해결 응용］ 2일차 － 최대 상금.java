import java.io.*;
import java.util.*;

public class Solution {
    static int N, K;
    static int best;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] nums = st.nextToken().toCharArray();
            K = Integer.parseInt(st.nextToken());
            N = nums.length;
            best = 0;

            Set<Integer>[] visited = new HashSet[K + 1];
            for (int i = 0; i <= K; i++) visited[i] = new HashSet<>();

            dfs(nums, 0, visited);

            sb.append("#").append(tc).append(" ").append(best).append("\n");
        }
        System.out.print(sb);
    }

    static void dfs(char[] nums, int depth, Set<Integer>[] visited) {
        int cur = Integer.parseInt(new String(nums));

        if (visited[depth].contains(cur)) return;
        visited[depth].add(cur);

        if (depth == K) {
            best = Math.max(best, cur);
            return;
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                swap(nums, i, j);
                dfs(nums, depth + 1, visited);
                swap(nums, i, j); 
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}