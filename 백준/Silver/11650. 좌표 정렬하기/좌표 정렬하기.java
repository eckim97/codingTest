import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][]arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

//        for (int i = 0; i < n - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j][0] < arr[min][0] || arr[j][0] == arr[min][0] && arr[j][1] < arr[min][1]) {
//                    min = j;
//                }
//            }
//            int[] temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]){
                    return Integer.compare(a[1], b[1]);
                }else{
                    return Integer.compare(a[0], b[0]);
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}