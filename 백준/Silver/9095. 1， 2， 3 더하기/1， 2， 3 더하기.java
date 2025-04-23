import java.io.*;
import java.util.*;

public class Main {
    static int N, M;             
    static int[][] rect;        
    static long[][] sum;        

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i < 11; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(arr[x]);
        }

    }
}