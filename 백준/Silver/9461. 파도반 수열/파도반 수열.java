import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            long[] arr = new long[Math.max(a + 1, 4)];

            arr[1] = arr[2] = arr[3] = 1;

            for (int j = 4; j <= a; j++) {
                arr[j] = arr[j-2] + arr[j-3];
            }
            System.out.println(arr[a]);
        }
    }
}




