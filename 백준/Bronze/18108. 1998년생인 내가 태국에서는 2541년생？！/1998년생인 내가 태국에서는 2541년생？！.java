import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int result = 0;

        if (i <= 3000 && i >= 1000) {
                result = i - 543;
        }

        System.out.println(result);
    }
}
