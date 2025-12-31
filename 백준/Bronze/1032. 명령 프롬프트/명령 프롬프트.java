import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String pattern = sc.nextLine();
        
        for (int i = 1; i < n; i++) {
            String fileName = sc.nextLine();
            pattern = compare(pattern, fileName);
        }
        
        System.out.println(pattern);
    }
    
    static String compare(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));  
            } else {
                result.append('?');            
            }
        }
        
        return result.toString();
    }
}