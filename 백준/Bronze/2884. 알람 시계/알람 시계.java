import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            N--;
            M = (60 + M) - 45;
            if (N < 0){
                N = 23;
            }
            System.out.println(N + " " + M);
        } else{
            System.out.println(N + " " + (M - 45));
        }
        

    }
}
