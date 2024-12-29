import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next().toUpperCase();
        String b[] = new String[a.length()];
        int num[] = new int[50];

        for (int i = 0; i < a.length(); i++) {
            int nnum = a.charAt(i) - 65;
            num[nnum]++;
        }
        int max = 0;
        char ttmp = ' ';

        for (int j = 0; j < num.length; j++) {
            if (max < num[j]){
                max = num[j];
                ttmp = (char) (j +65);
            }
            else if (max == num[j]){
                ttmp = '?';
            }
        }
        System.out.println(ttmp);
    }
}

