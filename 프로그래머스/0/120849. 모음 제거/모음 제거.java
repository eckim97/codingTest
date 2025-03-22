class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] str = {"a", "e", "i", "o", "u"};
        
        for (String s : str) {
            answer = answer.replaceAll(s, "");
        }
        return answer;
    }
}