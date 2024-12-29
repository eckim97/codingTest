import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Long gcd(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        Long gcdValue = gcd(Long.parseLong(str[0]), Long.parseLong(str[1]));

        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < gcdValue; i++) {
            sb.append("1");
        }
        System.out.println(sb);
    }
}
