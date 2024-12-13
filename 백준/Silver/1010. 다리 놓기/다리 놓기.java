import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            int N = scanner.nextInt();

            System.out.println(nCr(N, R));
        }
    }

    public static long nCr (int n, int r){

        r = Math.min(r, n-r);

        long result = 1;

        for (int i = 0; i < r; i++){
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}