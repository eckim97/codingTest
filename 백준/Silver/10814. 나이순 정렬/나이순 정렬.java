import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];

            if (!map.containsKey(age)) {
                map.put(age, new ArrayList<>());
            }
            map.get(age).add(name);
        }

        List<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key);

        for (Integer age : key) {
            for (String name : map.get(age)) {
                System.out.println(age + " " + name);
            }
        }
    }
}