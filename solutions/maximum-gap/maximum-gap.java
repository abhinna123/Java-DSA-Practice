class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        if (min == max) return 0;
        
        int gap = (int) Math.ceil((double)(max - min) / (n - 1));
        
        int[] bucketMin = new int[n - 1];
        int[] bucketMax = new int[n - 1];
        boolean[] used = new boolean[n - 1];
        
        for (int i = 0; i < n - 1; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }
        
        for (int num : nums) {
            if (num == min || num == max) continue;
            
            int index = (num - min) / gap;
            
            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);
            used[index] = true;
        }
        
        int maxGap = 0;
        int prev = min;
        
        for (int i = 0; i < n - 1; i++) {
            if (!used[i]) continue;
            
            maxGap = Math.max(maxGap, bucketMin[i] - prev);
            prev = bucketMax[i];
        }
        
        maxGap = Math.max(maxGap, max - prev);
        
        return maxGap;
    }
}