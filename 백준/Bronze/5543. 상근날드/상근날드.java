import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bugerResult = Integer.MAX_VALUE;
        int drinkResult = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int buger = Integer.parseInt(br.readLine());
            if (buger < bugerResult) {
                bugerResult = buger;
            }
        }

        for (int i = 0; i < 2; i++) {
            int drink = Integer.parseInt(br.readLine());
            if (drink < drinkResult) {
                drinkResult = drink;
            }
        }

        System.out.println(bugerResult + drinkResult - 50);
    }
}