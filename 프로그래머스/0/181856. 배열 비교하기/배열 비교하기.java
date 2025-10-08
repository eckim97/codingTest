class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        
        int sum = 0;
        int sum2 = 0;
        
        if (a > b){
            answer = 1;    
        } else if (b > a){
            answer = -1;
        } else {
            for (int i = 0; i < arr1.length; i++){
                sum += arr1[i];
            }
            
            for (int i = 0; i < arr2.length; i++){
                sum2 += arr2[i];
            }
            
            if (sum == sum2){
                answer = 0;
            } else{
                if (sum > sum2){
                    answer = 1;
                } else{
                    answer = -1;
                }
            }
        }
        
        return answer;
    }
}