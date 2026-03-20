class Solution {
    public boolean isPalindrome(int x) {
        int num = x ;
        int res = 0;
        if(x < 0) return false;
        while(x!=0){
            int n = x%10;
            res = res*10+n;
            x = x/10;
        }
        return res==num;
    }
}