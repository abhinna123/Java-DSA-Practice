class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        if (n == 0) return result;

        int start = nums[0];

        for (int i = 0; i < n; i++) {
            // Check if it's end of range
            if (i == n - 1 || nums[i] + 1 != nums[i + 1]) {
                
                if (start == nums[i]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i]);
                }

                // Move start to next number
                if (i + 1 < n) {
                    start = nums[i + 1];
                }
            }
        }

        return result;
    }
}