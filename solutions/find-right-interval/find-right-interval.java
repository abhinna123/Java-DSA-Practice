import java.util.*;

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];

        int[][] starts = new int[n][2]; // {start, index}
        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }

        Arrays.sort(starts, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];

            int left = 0, right = n - 1;
            int ans = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (starts[mid][0] >= end) {
                    ans = starts[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[i] = ans;
        }

        return result;
    }
}