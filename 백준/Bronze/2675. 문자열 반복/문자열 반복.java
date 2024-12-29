import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            String str = sc.next();

            char[] arr = new char[a * str.length()];

            int cnt = 0;
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < a; k++){
                    arr[cnt++] = str.charAt(j);
                }
            }
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}




