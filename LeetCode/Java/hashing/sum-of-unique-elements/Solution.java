import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int value : nums) {
            frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
        }

        int sum = 0;
        for (int value : nums) {
            if (frequencies.get(value) == 1) {
                sum += value;
            }
        }
        return sum;
    }
}
