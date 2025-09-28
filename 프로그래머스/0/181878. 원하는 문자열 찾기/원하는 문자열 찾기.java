class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = myString.toLowerCase();
        
        for (int i = 0; i < temp.length(); i++){
            if (temp.contains(pat.toLowerCase())){
                answer = 1;
            }
        }
        
        return answer;
    }
}