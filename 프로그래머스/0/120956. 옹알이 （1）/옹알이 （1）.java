class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String temp = word;
            
            for (String w : words) {
                temp = temp.replace(w, " ");
            }
            
            temp = temp.replace(" ", "");
            
            if (temp.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}