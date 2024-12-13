import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = 0;

            if (st.hasMoreTokens()) {
                b = Integer.parseInt(st.nextToken());
            }

            if (a.equals("push")) {
                queue.add(b);
            }else if (a.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                }else System.out.println(queue.peek());
            }else if (a.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                }else System.out.println(((LinkedList<Integer>) queue).getLast());
            }else if (a.equals("size")) {
                System.out.println(queue.size());
            }else if (a.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                }else System.out.println(0);
            }else if (a.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                }else System.out.println(queue.poll());
            }
        }
    }
}

