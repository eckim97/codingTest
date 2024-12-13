import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int[] base = new int[26];

        for(int i = 0; i < base.length; i++){
            base[i] = -1;
        }

        for (int i = 0; i < a.length(); i++) {
            if(base[a.charAt(i) - 'a'] == -1){
                base[a.charAt(i) - 'a'] = i;
            }
        }

        for(int i = 0; i < base.length; i++){
            System.out.print(base[i] + " ");
        }

    }
}




