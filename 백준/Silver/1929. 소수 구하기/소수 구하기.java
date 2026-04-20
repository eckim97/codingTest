import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        boolean[] isComposite = new boolean[N + 1]; 
        isComposite[0] = isComposite[1] = true;
        
        for (int i = 2; i * i <= N; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (!isComposite[i]) {
                sb.append(i).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}