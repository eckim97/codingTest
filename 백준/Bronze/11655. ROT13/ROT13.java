import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] = (char)((chars[i] - 'A' + 13) % 26 + 'A');
            }
            else if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) ((chars[i] - 'a' + 13) % 26 + 'a');
            }
        }
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}
