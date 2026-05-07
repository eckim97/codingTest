import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> idx = new HashMap<>();
        for (int i = 0; i < n; i++) idx.put(friends[i], i);

        int[][] give = new int[n][n];
        int[] giftScore = new int[n];

        for (String gift : gifts) {
            String[] g = gift.split(" ");
            int a = idx.get(g[0]), b = idx.get(g[1]);
            give[a][b]++;
            giftScore[a]++;
            giftScore[b]--;
        }

        int[] next = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (give[i][j] > give[j][i]) {
                    next[i]++;
                } else if (give[i][j] < give[j][i]) {
                    next[j]++;
                } else {
                    if (giftScore[i] > giftScore[j]) next[i]++;
                    else if (giftScore[i] < giftScore[j]) next[j]++;
                }
            }
        }

        int max = 0;
        for (int v : next) max = Math.max(max, v);
        return max;
    }
}