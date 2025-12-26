class Solution {
    public int solution(String A, String B) {
        
        if (A.equals(B)){
            return 0;
        }
        
        String temp = A;
        
        for (int i = 1; i <= A.length(); i++){
            temp = temp.charAt(temp.length() - 1) + temp.substring(0, temp.length() - 1);
            
            if (temp.equals(B)){
                return i;
            }
        }
        
        return -1;
    }
}