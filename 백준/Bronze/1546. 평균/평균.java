import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            sum += score;
            if (score > max) {
                max = score;
            }
        }
        
        double avg = (double) sum / max * 100 / N;
        
        System.out.println(avg);
        
        sc.close();
    }
}