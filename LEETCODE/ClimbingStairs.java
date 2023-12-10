import java.util.HashMap;
import java.util.Scanner;

class Solution {
    HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(store.containsKey(n)){
            return store.get(n);
        }
        else{
            int i = climbStairs(n-1) + climbStairs(n-2);
            store.putIfAbsent(n, i);
            return i;
        }
    }
}


public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Solution s = new Solution();
        s.climbStairs(n);
        scan.close();
    }
}

