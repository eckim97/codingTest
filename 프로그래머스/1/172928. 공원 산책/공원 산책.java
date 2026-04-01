import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int startR = 0, startC = 0;
        int rows = park.length;
        int cols = park[0].length();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park[i].charAt(j) == 'S') {
                    startR = i;
                    startC = j;
                }
            }
        }
        
        int[] dr = {-1, 1, 0, 0}; 
        int[] dc = {0, 0, -1, 1};
        Map<String, Integer> dir = new HashMap<>();
        dir.put("N", 0); dir.put("S", 1); dir.put("W", 2); dir.put("E", 3);
        
        int r = startR, c = startC;
        
        for (String route : routes) {
            String[] parts = route.split(" ");
            int d = dir.get(parts[0]);
            int dist = Integer.parseInt(parts[1]);
            
            int nr = r, nc = c;
            boolean blocked = false;
            
            for (int i = 0; i < dist; i++) {
                nr += dr[d];
                nc += dc[d];
                
                if (nr < 0 || nr >= rows || nc < 0 || nc >= cols || park[nr].charAt(nc) == 'X') {
                    blocked = true;
                    break;
                }
            }
            
            if (!blocked) {
                r = nr;
                c = nc;
            }
        }
        
        return new int[]{r, c};
    }
}