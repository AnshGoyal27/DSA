public class MaxArray {
    // static public int maxSubArray(int[] nums) {
    //     int sum = 0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //     }
    //     int[] bound = new int[1];
    //     bound[0]=sum;
    //     int[][] dp = new int[nums.length][nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums.length;j++){
    //             dp[i][j]=Integer.MAX_VALUE;
    //         }
    //     }
    //     findMax(sum, 0, nums.length-1, bound, nums, dp);
    //     return bound[0];
        
    // }
    // static public void findMax(int sum, int i, int j, int[] bound, int[] nums, int[][] dp){
    //     if(i>j){
    //         return;
    //     }
    //     if(sum>bound[0]){
    //         bound[0]=sum;

    //     }
    //     if(dp[i][j]!=Integer.MAX_VALUE){
    //         return;
    //     }
    //     dp[i][j]=sum;
    //     findMax(sum-nums[i], i+1, j, bound, nums, dp);
    //     findMax(sum-nums[j], i, j-1, bound, nums, dp);
    // }

    static public int maxSubArray(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-1};
        System.out.println(maxSubArray(nums));
    }
}
