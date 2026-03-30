import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        
        for (int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        
        dfs(1);
        
        System.out.println(count);
    }
    static void dfs(int node){
        visited[node] = true;
        
        for (int next : graph[node]){
            if (!visited[next]){
                count++;
                dfs(next);
            }
        }
    }
    
}