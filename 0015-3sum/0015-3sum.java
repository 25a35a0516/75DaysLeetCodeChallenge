class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            Set<Integer> hash = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int third = -(nums[i]+nums[j]);
                if(hash.contains(third)){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(third);
                    Collections.sort(res);
                    set.add(res);
                }
                hash.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}