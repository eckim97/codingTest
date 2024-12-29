import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<Integer> people = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        List<Integer> result = new LinkedList<>();
        int index = 0;

        while (!people.isEmpty()) {
            index = (index + k - 1) % people.size();
            result.add(people.remove(index));
        }

        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            } else{
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}
