class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        for(int i=1;i<prices.length;i++){
            m=Math.max(m,prices[i]-prices[i-1]);
            prices[i]=Math.min(prices[i],prices[i-1]);
        }return m;
    }
}