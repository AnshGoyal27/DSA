import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class CoinChanges {

    // SOLUTION 1

    // static public int coinChange(int[] coins, int amount) {
    //     int[] bound = {Integer.MAX_VALUE};
    //     Arrays.sort(coins);
    //     int min = coinC(coins, amount, coins.length-1,0, 0, bound);
    //     if(min==Integer.MAX_VALUE){
    //         return -1;
    //     }
    //     return min;
    // }

    // static public int coinC(int[] coins, int amount, int j, int coin, int noChange, int[] bound){
    //     if(coin>bound[0]){
    //         return bound[0];
    //     }
    //     if(noChange==coins.length){
    //         return Integer.MAX_VALUE;
    //     }
    //     if(j==-1){
    //         return coinC(coins, amount, coins.length-1, coin, noChange, bound);
    //     }
    //     if(amount==0){
    //         if(coin<bound[0]){
    //             bound[0] = coin;
    //         }
    //         return coin;
    //     }
    //     if(amount<0){
    //         return Integer.MAX_VALUE;
    //     }
    //     else{
    //         int c1 = coinC(coins, amount, j-1, coin, noChange+1, bound);
    //         int c2 = coinC(coins, amount-coins[j], j-1, coin+1, 0, bound);
    //         return Math.min(c1, c2);
    //     }
    // }
    
    // SOLUTION 2

    // static public int coinChange(int[] coins, int amount) {
    //     int[] bound = {Integer.MAX_VALUE};
    //     Arrays.sort(coins);
    //     coinC(coins, amount, 0, bound);
    //     if(bound[0]==Integer.MAX_VALUE){
    //         return -1;
    //     }
    //     return bound[0];
    // }

    // static public void coinC(int[] coins, int amount, int coin, int[] bound){
    //     if(coin>bound[0]){
    //         return;
    //     }
    //     if(amount==0){
    //         if(coin<bound[0]){
    //             bound[0] = coin;
    //         }
    //     }
    //     if(amount<0){
    //         return;
    //     }
    //     for(int i=coins.length-1;i>=0;i--){
    //         coinC(coins, amount-coins[i], coin+1, bound);
    //     }

    // }

    // SOLUTION 3

    static public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int min = coinC(coins, amount, dp);
        return min==Integer.MAX_VALUE?-1:min;
    }

    static public int coinC(int[] coins, int amount, int[] dp){
        int min = Integer.MAX_VALUE;
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=Integer.MAX_VALUE){
            if(dp[amount]==-1){
                return Integer.MAX_VALUE;
            }
            return dp[amount]+1;
        }
        for(int i=coins.length-1;i>=0;i--){
            int cost = coinC(coins, amount-coins[i], dp);
            if(cost<min){
                min = cost;
            }
        }
        dp[amount] = min==Integer.MAX_VALUE?-1:min;
        return (min==Integer.MAX_VALUE)? min: min+1;

    }



    public static void main(String[] args) {
        int[] amount = {186,419,83,408};
        System.out.println(coinChange(amount, 6249));
    }
}
