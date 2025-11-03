class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = 0;

        while ((index = myString.indexOf(pat, index)) != -1) {
            count++;
            index += 1; 
        }

        return count;
    }
}
