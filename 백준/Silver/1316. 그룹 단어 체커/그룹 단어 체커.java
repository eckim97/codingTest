import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int n = 0; n < T; n++) {
            String str = br.readLine();
            if(includeWord(str)){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean includeWord(String str) {
        HashSet<Character> crr = new HashSet<>();
        char last = '0';
        boolean includeWord = true;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != last) {
                if (crr.contains(current)) {
                    includeWord = false;
                    break;
                }
                crr.add(current);
                last = current;
            }
        }
        return includeWord;
    }
}




