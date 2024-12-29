import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String zinBub = str[0];
        int num = Integer.parseInt(str[1]);
        int result = 0;

        for (int i = 0; i < zinBub.length(); i++) {
            char c = zinBub.charAt(i);
            int value = Character.digit(c, num);
            result = result * num + value;
        }
        System.out.println(result);
    }
}
