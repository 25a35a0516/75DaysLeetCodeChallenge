class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
            if(i<nums.length) System.out.print(",");
        }
        System.out.print("]");
    }
}