import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static int[] selected;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];
        selected = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        perm(0);
        System.out.println(answer);
    }

    static void perm(int depth) {
        if (depth == n) {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += Math.abs(selected[i] - selected[i + 1]);
            }
            answer = Math.max(answer, sum);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[depth] = arr[i];
                perm(depth + 1);
                visited[i] = false;
            }
        }
    }
}