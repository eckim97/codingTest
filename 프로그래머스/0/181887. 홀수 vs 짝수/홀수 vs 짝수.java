class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < num_list.length; i++){
            if (i % 2 == 0){
                a += num_list[i];
            } else{
                b += num_list[i];
            }
        }
        if (a > b){
            return a;
        } else{
            return b;
        }
    }
}