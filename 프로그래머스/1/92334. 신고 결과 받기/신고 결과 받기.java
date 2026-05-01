import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> mailCount = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            mailCount.put(id, 0);
        }

        for (String r : report) {
            String[] split = r.split(" ");
            reportMap.get(split[1]).add(split[0]);
        }

        for (String reported : reportMap.keySet()) {
            if (reportMap.get(reported).size() >= k) {
                for (String reporter : reportMap.get(reported)) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }

        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            result[i] = mailCount.get(id_list[i]);
        }

        return result;
    }
}