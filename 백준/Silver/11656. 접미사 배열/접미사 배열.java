import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        String[] str = new String[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            str[i] = temp.substring(i);
        }

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
