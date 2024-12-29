import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            int A = Integer.parseInt(br.readLine());
            if (A < 40) {
                A = 40;
            }
            sum += A;
        }
        
        int avg = sum / 5;
        System.out.println(avg);
    }
}
