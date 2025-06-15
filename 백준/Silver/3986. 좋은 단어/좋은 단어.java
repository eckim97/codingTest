import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int ret = 0;

        for (int i = 0; i < T; i++) {
            String N = br.readLine();
            Stack<Character> st = new Stack<>();

            for (char c : N.toCharArray()) {
                if (!st.isEmpty() && st.peek() == c) {
                    st.pop();
                } else{
                    st.push(c);
                }
            }
            if (st.isEmpty()) ret ++;
        }
        System.out.println(ret);
    }
}