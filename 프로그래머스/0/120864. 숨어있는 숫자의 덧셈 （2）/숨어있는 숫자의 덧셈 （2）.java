class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("[^0-9]+");
        
        int sum = 0;
        for (String str : arr) {
            if (!str.isEmpty()) {
                sum += Integer.parseInt(str);
            }
        }
        
        return sum;
    }
}