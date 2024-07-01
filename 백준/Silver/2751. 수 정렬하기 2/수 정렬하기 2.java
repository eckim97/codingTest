import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] sort = new int[n];

        for (int i = 0; i < n; i++) {
            sort[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(sort);
        
        StringBuilder sb = new StringBuilder();
        for (int num : sort) {
            sb.append(num).append('\n');
        }
        System.out.println(sb.toString());
    }
}


