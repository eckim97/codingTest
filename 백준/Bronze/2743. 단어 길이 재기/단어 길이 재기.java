import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] c = str.toCharArray();
        int cnt = 0;

        for (int i = 0; i < c.length; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
