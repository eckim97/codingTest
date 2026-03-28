import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < N; i++){
            set.add(sc.nextLine());
        }
        
        String[] words = set.toArray(new String[0]);
        
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        
        for (String word : words){
            System.out.println(word);
        }
    }
}