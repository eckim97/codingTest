import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] alpha = new int[26];

        for (char c : input.toCharArray()) {
            alpha[c - 'A']++;
        }

        int oddCount = 0;
        int oddIndex = -1;

        for (int i = 0; i < 26; i++) {
            if (alpha[i] % 2 != 0) {
                oddCount++;
                oddIndex = i;
            }
        }

        if (oddCount >= 2) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int count = alpha[i] / 2;
            for (int j = 0; j < count; j++) {
                sb.append((char)(i + 'A'));
            }
        }

        StringBuilder result = new StringBuilder();

        result.append(sb);

        if (oddIndex != -1) {
            result.append((char) (oddIndex + 'A'));
        }

        result.append(sb.reverse());

        System.out.println(result.toString());
    }
}