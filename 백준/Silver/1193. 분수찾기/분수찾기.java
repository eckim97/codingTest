import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int diagonal = 1; 
        int sum = 0;

        while (sum + diagonal < n) {
            sum += diagonal;
            diagonal++;
        }

        int index = n - sum; 

        int numerator, denominator;

        if (diagonal % 2 == 0) {
            numerator = index;
            denominator = diagonal - index + 1;
        } else {
            numerator = diagonal - index + 1;
            denominator = index;
        }

        System.out.println(numerator + "/" + denominator);
    }
}