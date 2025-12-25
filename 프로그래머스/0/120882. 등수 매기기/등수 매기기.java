class Solution {
    public int[] solution(int[][] score) {
        int n = score.length; 
        
        int[] avg = new int[n];
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++){
            avg[i] = score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < n; i++){
            int rank = 1;
            for (int j = 0; j < n; j++){
                if (avg[j] > avg[i]){
                    rank++;
                }
                answer[i] = rank;
            }
        }
        return answer;
    }
}