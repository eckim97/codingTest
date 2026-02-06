class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - pLength; i++) {
            String sub = t.substring(i, i + pLength);
            long subNum = Long.parseLong(sub);
            
            if (subNum <= pNum) {
                count++;
            }
        }
        
        return count;
    }
}