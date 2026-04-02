import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int total = stages.length;
        int[] count = new int[N + 2];
        
        for (int s : stages){
            count[s]++;
        }
        
        double[] failRate = new double[N + 1];
        
        for (int i = 1; i <= N; i++){
            if (total == 0){
                failRate[i] = 0;
            } else{
                failRate[i] = (double) count[i] / total;
                total -= count[i];
            }
        }
        
        double[][] arr = new double[N][2];
        for (int i = 0; i < N; i++){
            arr[i][0] = i + 1;
            arr[i][1] = failRate[i + 1];
        }
        
        for (int i = 0; i < N - 1; i++){
            for (int j = i + 1; j < N; j++){
                if (arr[i][1] < arr[j][1] ||
    (arr[i][1] == arr[j][1] && arr[i][0] > arr[j][0])){
                    double[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++){
            answer[i] = (int) arr[i][0];
        }
        
        return answer;
    }
}