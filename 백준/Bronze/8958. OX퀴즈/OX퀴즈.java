import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            String str = sc.nextLine();
            int count = 0;
            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                }else{
                    count = 0;
                }
                sum += count;
            }
            b[i] = sum;
        }

        for (int result : b) {
            System.out.println(result);
        }
    }
}