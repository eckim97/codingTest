import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetChannel = Integer.parseInt(br.readLine());
        int brokenCount = Integer.parseInt(br.readLine());

        if (brokenCount > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < brokenCount; i++) {
                int button = Integer.parseInt(st.nextToken());
                broken[button] = true;
            }
        }

        int minPresses = Math.abs(targetChannel - 100);

        for (int channel = 0; channel < 1000000; channel++) {
            int length = possible(channel);

            if (length > 0) {
                int press = length + Math.abs(targetChannel - channel);
                minPresses = Math.min(minPresses, press);
            }
        }

        System.out.println(minPresses);
    }

    public static int possible(int channel) {
        if (channel == 0) {
            if (broken[0]) return 0;
            else return 1;
        }

        int length = 0;
        while (channel > 0) {
            int digit = channel % 10;

            if (broken[digit]) {
                return 0;
            }

            length ++;
            channel /= 10;
        }
        return length;
    }
}