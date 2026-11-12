class Solution {
    public int searchInsert(int[] nums, int target) {
        int number=0;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]>=target){
                number++;
                break;
            }
        }if(number>0){
            return i;
        }
        return nums.length;
    }
}