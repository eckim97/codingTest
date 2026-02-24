class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()){
            char result = c;
            int count = 0;
            
            while (count < index){
                result ++;
                
                if (result > 'z'){
                    result = 'a';
                }
                
                if (skip.indexOf(result) == -1){
                    count++;
                }
            }
            
            answer.append(result);
        }
        
        return answer.toString();
        
    }
}