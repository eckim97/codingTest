import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] dp = new int[a];
        int[] dp2 = new int[a];
        int result = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        for(int i = a-1; i >= 0; i--){
            dp2[i] = 1;
            for(int j = a-1; j > i; j--){
                if (arr[j] < arr[i]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }

        for (int i = 0; i < a; i++) {
            result = Math.max(result, dp[i] + dp2[i]);
        }

        System.out.println(result-1);
    }
}




