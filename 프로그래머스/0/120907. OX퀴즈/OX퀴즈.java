class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++){
            String[] parts = quiz[i].split(" ");
            
            int num1 = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int num2 = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);
            
            int calculation;
            if (operator.equals("+")){
                calculation = num1 + num2;
            } else {
                calculation = num1 - num2;
            }
            
            if (calculation == result){
                answer[i] = "O";
            } else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}