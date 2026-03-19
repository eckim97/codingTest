import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        int totalTime = 0;
        
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            totalTime += getTime(c);
        }
        System.out.println(totalTime);
        
        sc.close();
    }
    
    public static int getTime(char c){
        if (c >= 'A' && c <= 'C') return 3;
        if (c >= 'D' && c <= 'F') return 4;
        if (c >= 'G' && c <= 'I') return 5;
        if (c >= 'J' && c <= 'L') return 6;
        if (c >= 'M' && c <= 'O') return 7;
        if (c >= 'P' && c <= 'S') return 8;
        if (c >= 'T' && c <= 'V') return 9;
        if (c >= 'W' && c <= 'Z') return 10;
        return 0;
    }
}