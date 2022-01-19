class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0, profit = 0;
        for(int i : prices){
            if(i<buy){
                buy = i;
                sell = buy;
            }
            else if(sell < i){
                sell = i;
                profit = Math.max(profit, sell-buy);
            }
        }
        return profit;
    }
}