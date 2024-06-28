import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        int T = scanner.nextInt();

        c += T;

        m += c / 60;
        c = c % 60;

        h += m / 60;
        m = m % 60;

        h = h % 24;

        System.out.println(h + " " + m + " " + c);
    }
}