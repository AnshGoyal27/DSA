public class maxProfit {
    // public int maxProfit(int[] prices) {
    //     int profit = 0;
    //     int dp[] = new int[(int)Math.pow(10, 4)+2];
    //     for(int i=0;i<(int)Math.pow(10, 4)+1;i++){
    //         dp[i] = -1;
    //     }
    //     for(int i=0;i<prices.length;i++){
    //         if(dp[prices[i]]!=-1){
    //             continue;
    //         }
    //         else{
    //             for(int j=i+1;j<prices.length;j++){
    //                 if(prices[j]-prices[i]>profit){
    //                     profit = prices[j]-prices[i];
    //                 }
    //         }
    //         dp[prices[i]]=profit;
    //         }
    //     }
    //     return profit;
    // }

    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<least){
                least=prices[i];
            }
            int cost = prices[i]-least;
            if(cost>profit){
                profit=cost;
            }
        }
        return profit;
    }
}
