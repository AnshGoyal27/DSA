import java.util.HashMap;

public class MaxSubarray {
    // { MEMORY LIMIT EXCEEDED }
    // static public int maxSubArray(int[] nums) {
    //     int sum = 0;
    //     int[][] dp = new int[nums.length][nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //     }
    //     calc(sum, 0, nums.length-1, dp, nums);
    //     // for(int i=0;i<nums.length;i++){
    //     //     for(int j=0;j<nums.length;j++){
    //     //         System.out.print(dp[i][j]+" ");
    //     //     }
    //     //     System.out.println();
    //     // }
    //     return dp[0][nums.length-1];

    // }
    // static public int calc(int sum,int start, int end, int[][] dp,int[] nums){
    //     if(end==start){
    //         dp[start][end] = sum;
    //         return sum;
    //     }
    //     if(dp[start][end]!=0){
    //         return dp[start][end];
    //     }
    //     int max = Math.max(calc(sum-nums[start], start+1, end, dp,nums), calc(sum-nums[end], start, end-1, dp,nums));
    //     if(max>sum){
    //         dp[start][end] = max;
    //     }
    //     else{
    //         dp[start][end] = sum;
    //     }
    //     return dp[start][end];
        
    // }



    // { TIME LIMIT EXCEEDED }
    // static public int maxSubArray(int[] nums) {
    //     int sum = 0;
    //     HashMap<String,Integer> store = new HashMap<String,Integer>();;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //     }
    //     calc(sum, 0, nums.length-1, store, nums);
    //     // for(int i=0;i<nums.length;i++){
    //     //     for(int j=0;j<nums.length;j++){
    //     //         System.out.print(dp[i][j]+" ");
    //     //     }
    //     //     System.out.println();
    //     // }
    //     String key = String.valueOf(0)+String.valueOf(nums.length-1);
    //     return store.get(key);
    // }

    // static public int calc(int sum,int start, int end, HashMap<String,Integer> store,int[] nums){
    //     String key = String.valueOf(start)+String.valueOf(end);
    //     if(end==start){
    //         store.put(key, sum);
    //         return sum;
    //     }
    //     if(store.get(key)!=null){
    //         return store.get(key);
    //     }
    //     int max = Math.max(calc(sum-nums[start], start+1, end, store,nums), calc(sum-nums[end], start, end-1, store,nums));
    //     if(max>sum){
    //         store.put(key, max);
    //     }
    //     else{
    //         store.put(key, sum);
    //     }
    //     return store.get(key);
        
    // }

    static public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            // Removes if sum is -ve
            currSum = Math.max(nums[i], currSum+nums[i]);
            sum = Math.max(currSum, sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num = {1};
        System.out.println(maxSubArray(num));
    }
}
