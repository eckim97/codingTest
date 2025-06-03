import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] tempStrings = br.readLine().split(" ");
        int[] temps = new int[n];

        for (int i = 0; i < n; i++) {
            temps[i] = Integer.parseInt(tempStrings[i]);
        }

        if (k > n) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += temps[i];
        }

        int max = sum;

        for (int i = k; i < n; i++) {
            sum = sum - temps[i-k] + temps[i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}