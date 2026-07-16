class Solution {
    public int maxProfit(int[] prices) {
        int small = prices[0];
        int result = 0;
        for(int i=1;i<prices.length;i++){
            small = Math.min(small, prices[i]);
            result = Math.max(result, prices[i] - small);
        }
        return result;
    }
}