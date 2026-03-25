import java.lang.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxDiff = 0;
        int diff = 0;
        int minPrice = prices[0];
        for(int i=0; i<n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                diff = prices[i] - minPrice;
                maxDiff = Math.max(diff, maxDiff);
            }
        }
        return maxDiff;
    }
}