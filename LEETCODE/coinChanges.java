import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class coinChanges {
    // static public int coinChange(int[] coins, int amount) {
    //     int[] bound = {Integer.MAX_VALUE};
    //     Arrays.sort(coins);
    //     int min = coinC(coins, amount, coins.length-1,0, 0, bound);
    //     if(min==Integer.MAX_VALUE){
    //         return -1;
    //     }
    //     return min;
    // }

    static public int coinChange(int[] coins, int amount) {
        int[] bound = {Integer.MAX_VALUE};
        Arrays.sort(coins);
        coinC(coins, amount, 0, bound);
        if(bound[0]==Integer.MAX_VALUE){
            return -1;
        }
        return bound[0];
    }

    static public void coinC(int[] coins, int amount, int coin, int[] bound){
        if(coin>bound[0]){
            return;
        }
        if(amount==0){
            if(coin<bound[0]){
                bound[0] = coin;
            }
        }
        if(amount<0){
            return;
        }
        for(int i=coins.length-1;i>=0;i--){
            coinC(coins, amount-coins[i], coin+1, bound);
        }

    }

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
    

    public static void main(String[] args) {
        int[] amount = {1,2,5};
        System.out.println(coinChange(amount, 100));
    }
}
