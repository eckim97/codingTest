class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        String str = arr[1];
        int b = Integer.parseInt(arr[2]);
        
        if (str.equals("+")){
            answer = a + b;
        }else if (str.equals("-")){
            answer = a - b;
        }else {
            answer = a * b;
        }
        return answer;
    }
}