import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] t = term.split(" ");
            termMap.put(t[0], Integer.parseInt(t[1]));
        }

        int[] todayDate = toDate(today);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            int[] date = toDate(p[0]);
            int month = termMap.get(p[1]);

            date[1] += month;
            while (date[1] > 12) {
                date[0]++;
                date[1] -= 12;
            }

            if (compare(date, todayDate) <= 0) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    int[] toDate(String s) {
        String[] parts = s.split("\\.");
        return new int[]{
            Integer.parseInt(parts[0]),
            Integer.parseInt(parts[1]),
            Integer.parseInt(parts[2])
        };
    }

    int compare(int[] a, int[] b) {
        if (a[0] != b[0]) return a[0] - b[0];
        if (a[1] != b[1]) return a[1] - b[1];
        return a[2] - b[2];
    }
}