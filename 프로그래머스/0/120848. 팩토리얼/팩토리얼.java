class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        int k = 1;
        
        while(true){
            fac *= k;
            if (fac > n){
                answer = k;
                break;
            }
            k++;
        }
        
        return answer-1;
    }
}