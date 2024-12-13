import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean MinSoo(int num) {
        while (num > 0) {
            int temp = num % 10;

            if (temp != 4 && temp != 7) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = num; i >= 4; i--) {
            if (MinSoo(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
