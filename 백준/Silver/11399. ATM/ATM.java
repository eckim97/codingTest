import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] time = new int[N];
        
        for (int i = 0; i < N; i++){
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        
        int sum = 0;
        int total = 0;
        
        for (int i = 0; i < N; i++){
            sum += time[i];
            total += sum;
        }
        System.out.println(total);
    }
}