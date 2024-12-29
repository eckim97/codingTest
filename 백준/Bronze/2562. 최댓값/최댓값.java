import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int max = 0;
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());

            map.put(i, value);
            if (value > max) {
                max = value;
                index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
