import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        HashSet<Integer> types = new HashSet<>();
        for (int num : nums){
            types.add(num);
        }
        
        return Math.min(max, types.size());
    }
}