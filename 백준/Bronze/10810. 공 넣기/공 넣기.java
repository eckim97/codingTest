import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] baskets = new int[N + 1];
        
        for (int t = 0; t < M; t++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for (int b = i; b <= j; b++){
                baskets[b] = k;
            }
        }
        
        for (int b = 1; b <= N; b++){
            System.out.print(baskets[b] + " ");
        }
    }
}