import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str = line.split(" ");

        int n = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(Integer.toString(n, b).toUpperCase());
    }
}
