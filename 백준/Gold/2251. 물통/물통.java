import java.io.*;
import java.util.*;

public class Main {
    static int A, B, C;
    static boolean[][][] visited;
    static boolean[] possible = new boolean[201];

    static class State{
        int a, b, c;

        public State(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A= Integer.parseInt(st.nextToken());
        B= Integer.parseInt(st.nextToken());
        C= Integer.parseInt(st.nextToken());

        visited = new boolean[A + 1][B + 1][C + 1];

        dfs(0, 0, C);

        for (int i = 0; i <= C; i++) {
            if (possible[i]){
                System.out.print(i + " ");
            }
        }
    }

    static void dfs(int a, int b, int c) {
        if (visited[a][b][c]) return;

        visited[a][b][c] = true;

        if (a == 0) possible[c] = true;

        if (a > 0 && b < B) {
            int move = Math.min(a, B - b);
            dfs(a - move, b + move, c);
        }

        if (a > 0 && c < C) {
            int move = Math.min(a, C - c);
            dfs(a - move, b, c + move);
        }

        if (b > 0 && c < C) {
            int move = Math.min(b, C - c);
            dfs(a,b - move, c + move);
        }

        if (c > 0 && a < A) {
            int move = Math.min(c, A - a);
            dfs(a + move, b, c - move);
        }

        if (c > 0 && b < B) {
            int move = Math.min(c, B - b);
            dfs(a, b + move, c - move);
        }
    }
}
