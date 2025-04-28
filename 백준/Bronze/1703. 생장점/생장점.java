import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = 1; 
        
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); 
            if(a==0) break;

            for(int i=0; i<a; i++){
               b *= Integer.parseInt(st.nextToken()); 
               b -= Integer.parseInt(st.nextToken()); 
            }
            System.out.println(b);
            
            b=1;
        }
    }
}