import java.util.*;

public class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];

        int nextValue = last > secondLast ? last - secondLast : last * 2;

        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        result[result.length - 1] = nextValue;

        return result;
    }
}
