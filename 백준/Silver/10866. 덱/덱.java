import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push_front")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if (str.equals("push_back")){
                deque.addLast(Integer.parseInt(st.nextToken()));
            }else if (str.equals("pop_front")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(deque.removeFirst());
            }else if (str.equals("pop_back")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(deque.removeLast());
            }else if(str.equals("size")){
                System.out.println(deque.size());
            }else if (str.equals("empty")) {
                if (deque.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);
            }else if(str.equals("front")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(deque.peekFirst());
            }
            else if (str.equals("back")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(deque.peekLast());
            }
        }
    }
}
