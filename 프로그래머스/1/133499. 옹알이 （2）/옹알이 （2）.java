class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String babble : babbling) {
            String temp = babble;
            
            temp = temp.replace("aya", "1");
            temp = temp.replace("ye", "2");
            temp = temp.replace("woo", "3");
            temp = temp.replace("ma", "4");
            
            if (temp.contains("11") || temp.contains("22") || 
                temp.contains("33") || temp.contains("44")) {
                continue;  
            }
            
            if (temp.matches("[1-4]+")) {
                count++;  
            }
        }
        
        return count;
    }
}