import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine().trim());
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        long sum = 0;
        for (int n : stack) {
            sum += n;
        }
        
        System.out.println(sum);
    }
}