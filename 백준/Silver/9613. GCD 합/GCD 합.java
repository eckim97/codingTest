import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static Long gcd(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            ArrayList<Long> arrayList = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                arrayList.add(Long.parseLong(st.nextToken()));
            }

            long sum = 0;

            for (int a = 0; a < arrayList.size() - 1; a++) {
                for (int b = a + 1; b < arrayList.size(); b++) {
                    sum += gcd(arrayList.get(a), arrayList.get(b));
                }
            }
            System.out.println(sum);
        }
    }
}
