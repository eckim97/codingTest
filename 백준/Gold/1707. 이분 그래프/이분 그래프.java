import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] colors;
    static boolean isBipartite;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        while (K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            graph = new ArrayList[V + 1];
            for (int i = 0; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            colors = new int[V + 1];
            isBipartite = true;

            for (int i = 1; i <= V; i++) {
                if (colors[i] == 0) {
                    dfs(i, 1);
                }
                if (!isBipartite) break;
            }
            System.out.println(isBipartite ? "YES" : "NO");
        }
    }

    static void dfs(int node, int color) {
        colors[node] = color;

        for (int next : graph[node]) {
            if (colors[next] == 0) {
                dfs(next, -color);
            }
            else if(colors[next] == color) {
                isBipartite = false;
                return;
            }
        }
    }
}