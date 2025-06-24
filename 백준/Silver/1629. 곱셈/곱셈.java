import java.io.IOException;
import java.util.Scanner;

public class Main {
    static long C;

    public static long power(long a, long b){
        if (b == 0) return 1;
        long half = power(a , b/2);
        long result = (half * half) % C;

        if (b % 2 == 1) {
            result = (result * a) % C;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        C = sc.nextLong();

        System.out.println(power(a, b));

    }
}