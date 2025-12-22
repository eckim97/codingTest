import java.util.Arrays;


class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        String s = String.join("", spell);
        char[] spellArr = s.toCharArray();
        Arrays.sort(spellArr);
        
        for (String word : dic){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            
            if (Arrays.equals(spellArr, wordArr)){
                return 1;
            }
        }
        return 2;
    }
}