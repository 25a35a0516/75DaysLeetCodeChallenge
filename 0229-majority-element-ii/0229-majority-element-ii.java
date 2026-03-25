class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int min = n/3;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[i]==nums[j]) count ++;
            }
            if(count > min && !temp.contains(nums[i])){
                temp.add(nums[i]);
            }
        }
        return temp;
    }
}