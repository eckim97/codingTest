class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int l = 0;
        int r = 0;
        
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                l++;
            } else {
                r++;
            }
        }
        answer[0] = l;
        answer[1] = r;
        return answer;
    }
}