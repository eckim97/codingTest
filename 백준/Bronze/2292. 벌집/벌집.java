import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int layer = 1;  
        int range = 1;  
        
        while (range < N) {
            range += 6 * layer;
            layer++;
        }
        
        System.out.println(layer);
        
        sc.close();
    }
}