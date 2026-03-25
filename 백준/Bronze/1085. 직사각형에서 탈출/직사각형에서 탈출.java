import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int left = x;
        int right = w - x;
        int down = y;
        int up = h - y;
        
        int min = Math.min(Math.min(left, right), Math.min(down, up));
        System.out.println(min);                             
                             
    }
}