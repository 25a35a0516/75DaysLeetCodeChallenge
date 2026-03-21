class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
            if(i < nums.length-1) System.out.print(",");
        }
        System.out.print("]");
    }
     public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}