import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long A = Integer.parseInt(br.readLine());
        long F = 1;

        for (int i = 1; i <= A; i++) {
            F *= i;
        }
        System.out.println(F);

    }
}