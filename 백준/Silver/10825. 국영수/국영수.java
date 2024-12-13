import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, (a, b) -> {
            int Korean = Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1]));
            if (Korean != 0) {
                return Korean;
            }

            int English = Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
            if (English != 0) {
                return English;
            }

            int Math = Integer.compare(Integer.parseInt(b[3]), Integer.parseInt(a[3]));
            if (Math != 0) {
                return Math;
            }
            return a[0].compareTo(b[0]);
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]);
        }
    }
}

