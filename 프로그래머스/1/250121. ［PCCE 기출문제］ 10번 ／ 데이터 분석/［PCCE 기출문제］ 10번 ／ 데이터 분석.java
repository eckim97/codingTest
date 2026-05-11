import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] keys = {"code", "date", "maximum", "remain"};
        int extIdx = getIdx(keys, ext);
        int sortIdx = getIdx(keys, sort_by);

        return Arrays.stream(data)
                .filter(d -> d[extIdx] < val_ext)
                .sorted(Comparator.comparingInt(d -> d[sortIdx]))
                .toArray(int[][]::new);
    }

    int getIdx(String[] keys, String key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) return i;
        }
        return -1;
    }
}