import java.util.*;
import java.io.*;

public class Main {
    static int[][] maze;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        maze = new int[N][M];
        visited = new boolean[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        
        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 1}); // x, y, 거리
        visited[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0], cy = cur[1], dist = cur[2];
            
            if (cx == N - 1 && cy == M - 1) return dist;
            
            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (visited[nx][ny] || maze[nx][ny] == 0) continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, dist + 1});
            }
        }
        return -1;
    }
}