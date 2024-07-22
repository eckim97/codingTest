import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        for(int j = 0; j < 2; j++) {
            int temp = sc.nextInt();
            int temp2 = 0;

            for(int i = 1; i <= 3; i++) {
                int a = temp / 10;
                int b = temp % 10;
                temp = a;
                temp2 = (temp2 * 10) + b;
            }
            max = Math.max(max, temp2);
        }
        System.out.println(max);
    }
}




