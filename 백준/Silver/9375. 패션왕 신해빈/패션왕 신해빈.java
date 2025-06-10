import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            HashMap<String, Integer> hm = new HashMap<>();
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();

                if (hm.containsKey(kind)) {
                    hm.put(kind, hm.get(kind) + 1);
                } else {
                    hm.put(kind, 1);
                }
            }
            int result = 1;

            for (int count : hm.values()) {
                result *= (count + 1);
            }

            sb.append(result - 1).append('\n');

        }
        System.out.println(sb);

    }
}