import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(result);
    }
}