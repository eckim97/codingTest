import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (System.in);
        
        String word = sc.nextLine();
        
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String alpha : croatian){
            word = word.replace(alpha, "X");
        }
        System.out.println(word.length());
        
        sc.close();
    }
}