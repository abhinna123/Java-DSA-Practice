class Solution {
    int sum(int arr[]) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    int arraySum(int arr[], int size) {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        return total;
    }
}
