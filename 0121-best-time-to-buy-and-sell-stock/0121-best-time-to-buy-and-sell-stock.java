class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], n=prices.length, maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                int profit=prices[i]-buy;
                maxprofit=Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
}