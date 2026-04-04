class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        boolean found = false;
        int i = 0;
        while(i<n){
            if(nums[i]==target){
                found = true;
                return i;
            }
            if(nums[i]>target){
                return i;
            }
            i++;
        }
        return n;
    }
}