import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());  
        int N = Integer.parseInt(br.readLine()); 
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());  
            int count = Integer.parseInt(st.nextToken());  
            sum += price * count;
        }
        
        System.out.println(X == sum ? "Yes" : "No");
        
        br.close();
    }
}