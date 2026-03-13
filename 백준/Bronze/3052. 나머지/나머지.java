import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42;
            set.add(remainder);
        }
        
        System.out.println(set.size());
        
        sc.close();
    }
}