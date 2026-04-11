import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for (int i = 0; i < s.length(); i+=10){
            System.out.println(s.substring(i, Math.min(i + 10, s.length())));
        }
    }
}