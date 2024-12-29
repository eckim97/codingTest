import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList<Integer> sq = new ArrayList<>();
        sq.add(A);

        while(true) {
            int currnet = sq.get(sq.size() - 1);
            int next = 0;

            while (currnet > 0) {
                next += Math.pow(currnet % 10, P);
                currnet /= 10;
            }

            int index = sq.indexOf(next);
            if (index != -1) {
                System.out.println(index);
                break;
            }

            sq.add(next);
        }

    }
}