import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                result.add(num);
                seen.add(num);
            }
            if (result.size() == k) break;
        }

        while (result.size() < k) {
            result.add(-1);
        }

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
