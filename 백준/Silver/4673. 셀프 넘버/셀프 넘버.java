public class Main {
    public static void main(String[] args) {
        boolean[] isSelf = new boolean[10001];
        
        for (int i = 1; i <= 10000; i++) {
            int next = d(i);
            if (next <= 10000) {
                isSelf[next] = true; 
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!isSelf[i]) {
                sb.append(i).append('\n');
            }
        }
        
        System.out.print(sb);
    }
    
    static int d(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}