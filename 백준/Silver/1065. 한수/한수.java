import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isHansu(i)) count++;
        }
        
        System.out.println(count);
    }
    
    static boolean isHansu(int n) {
        if (n < 100) return true; 
        
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        
        return (b - a) == (c - b); 
    }
}