import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int E = 0;
        int S = 0;
        int M = 0;
        int year = 0;

        while(true){
            year++;
            E++;
            S++;
            M++;

            if (E > 15) E = 1;
            if (S > 28) S = 1;
            if (M > 19) M = 1;
            if (a == E && b == S && c == M) break;
        }
        System.out.println(year);
    }
}
