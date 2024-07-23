import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            long[] arr = new long[Math.max(a + 1, 6)];

            arr[1] = arr[2] = arr[3] = 1;
            arr[4] = arr[5] = 2;

            for (int j = 6; j <= a; j++) {
                arr[j] = arr[j-1] + arr[j-5];
            }
            System.out.println(arr[a]);
        }
    }
}




