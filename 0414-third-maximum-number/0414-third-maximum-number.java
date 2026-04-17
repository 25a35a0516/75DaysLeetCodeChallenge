import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        // int[] arr = new int[set.size()];
        // for(int i=0; i<set.size(); i++){
        //     arr[i]=set[i];
        // }
        // if(arr.length<2) return arr[arr.length-1];
        // return arr[2];

        if(set.size()<3) return set.last();
        set.pollLast();
        set.pollLast();
        return set.last();
    }
}