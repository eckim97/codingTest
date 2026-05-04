import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> score = new HashMap<>();
        for (char c : new char[]{'R','T','C','F','J','M','A','N'}) {
            score.put(c, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) {
                score.put(disagree, score.get(disagree) + (4 - choice));
            } else if (choice > 4) {
                score.put(agree, score.get(agree) + (choice - 4));
            }
        }

        StringBuilder sb = new StringBuilder();
        String[] pairs = {"RT", "CF", "JM", "AN"};
        for (String pair : pairs) {
            char a = pair.charAt(0);
            char b = pair.charAt(1);
            sb.append(score.get(a) >= score.get(b) ? a : b);
        }

        return sb.toString();
    }
}