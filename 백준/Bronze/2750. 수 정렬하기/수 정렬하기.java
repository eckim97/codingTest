import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (int number : list) {
            System.out.println(number);
        }
    }
}




