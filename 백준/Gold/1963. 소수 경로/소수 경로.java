import java.io.*;
import java.util.*;

public class Main {
    static boolean[] isPrime = new boolean[10000]; 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        findPrimes();
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            int result = bfs(start, end);
            
            if (result == -1) {
                System.out.println("Impossible");
            } else {
                System.out.println(result);
            }
        }
    }
    
    static void findPrimes() {
        Arrays.fill(isPrime, true);  
        isPrime[0] = isPrime[1] = false;  
        
        for (int i = 2; i * i < 10000; i++) {
            if (isPrime[i]) { 
                for (int j = i * i; j < 10000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    
    static int bfs(int start, int end) {
        if (start == end) return 0;  
        
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[10000];
        int[] distance = new int[10000];
        
        queue.offer(start);
        visited[start] = true;
        distance[start] = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            String currentStr = String.valueOf(current);
            
            for (int pos = 0; pos < 4; pos++) {  
                for (int digit = 0; digit <= 9; digit++) {  
                    if (pos == 0 && digit == 0) continue;
                    
                    char[] chars = currentStr.toCharArray();
                    chars[pos] = (char)('0' + digit);
                    int next = Integer.parseInt(new String(chars));
                    
                    if (next < 1000) continue;          
                    if (!isPrime[next]) continue;       
                    if (visited[next]) continue;       
                    
                    if (next == end) {
                        return distance[current] + 1;
                    }
                    
                    queue.offer(next);
                    visited[next] = true;
                    distance[next] = distance[current] + 1;
                }
            }
        }
        
        return -1; 
    }
}
