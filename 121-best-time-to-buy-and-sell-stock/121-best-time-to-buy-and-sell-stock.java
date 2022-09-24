class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int buy = Integer.MAX_VALUE;;
        for(int i=0; i<prices.length; i++){
            
            // First Ans
            buy = Math.min(buy, prices[i]);
            ans = Math.max(ans, prices[i]-buy);
            
                
            // Second Ans
            // if(buy > prices[i]){
            //     buy = prices[i];
            // }else if(prices[i]-buy > ans){
            //     ans = prices[i]-buy;
            // }
        }
        return ans;
    }
}