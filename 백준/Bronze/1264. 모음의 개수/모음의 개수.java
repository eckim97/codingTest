import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            int cnt = 0;
            if (str.equals("#")) break;
            for (int i = 0; i < str.length(); i++) {
                char c = Character.toLowerCase(str.charAt(i)); // 대문자를 소문자로 변환
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}