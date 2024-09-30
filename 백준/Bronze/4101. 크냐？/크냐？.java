import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<int[]> list = new ArrayList<>();

        while(true){
            String str = br.readLine();
            String[] input = str.split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a == 0 && b == 0) break;
            list.add(new int[]{a,b});
        }

        for (int[] ints : list) {
            if(ints[0] > ints[1]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
