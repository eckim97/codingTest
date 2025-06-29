import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;


        while((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);

            int cnt = 1;
            int ret = 1;


            while (cnt % n != 0) {
                cnt = (cnt * 10 + 1) % n;
                ret++;
            }
            System.out.println(ret);
        }
    }
}