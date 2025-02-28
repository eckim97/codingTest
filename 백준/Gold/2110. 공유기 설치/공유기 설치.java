import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        int result = 0;
        int start = 1;
        int end = houses[N-1] - houses[0];

        while (start <= end) {
            int cnt = 1;
            int mid = (start + end) / 2;
            int lastInstalled = houses[0];

            for (int i = 1; i < houses.length; i++) {
                if (houses[i] - lastInstalled >= mid) {
                    cnt++;
                    lastInstalled = houses[i];
                }
            }

            if (cnt >= C){
                result = mid;
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        System.out.println(result);

    }
}


