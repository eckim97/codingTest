import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            HashSet<Character> current = new HashSet<>();
            char last = '0';
            boolean includeWord = true;

            for (int j = 0; j < str.length(); j++) {
                char crr = str.charAt(j);


                if (crr != last) {
                    if (current.contains(crr)) {
                        includeWord = false;
                        break;
                    }
                    current.add(crr);
                    last = crr;
                }
            }
            if (includeWord) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}




