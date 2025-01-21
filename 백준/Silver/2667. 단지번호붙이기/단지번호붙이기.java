import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static int[][] map;
    static int count;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    count = 0;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int x : result) {
            System.out.println(x);
        }
    }

        static void dfs(int x, int y){
            map[x][y] = 0;
            count++;

            direction(x + 1, y);
            direction(x - 1, y);
            direction(x, y + 1);
            direction(x, y- 1);
        }

        static void direction(int x, int y){
            if (x >= 0 && x < N && y >= 0 && y < N && map[x][y] == 1) {
                dfs(x, y);
            }
        }
    }


