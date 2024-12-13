
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int r = 1;

            for (int j = 1; j <= b; j++) {
                r = r * a % 10;
            }

            if (r == 0) {
                r = 10;
            }
            System.out.println(r);
        }

    }
}


