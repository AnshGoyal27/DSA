public class EqualPartition {
    static public boolean canPartition(int[] nums) {
        int i = 0;
        int sum = 0;
        for (int j2 = 0; j2 < nums.length; j2++) {
            sum+=nums[j2];
        }
        if(sum%2!=0){
            System.out.println("Here");
            return false;
        }
        int[][] dp = new int[nums.length][sum/2];
        return checkPartition(nums, i, 0, sum/2, dp);
    }
    static public boolean checkPartition(int[] nums,int i, int sum, int aim, int[][] dp){
        if(i>=nums.length){
            return false;
        }
        if(sum>aim){
            return false;
        }
        if(sum==aim){
            return true;
        }
        if(dp[i][sum]!=0){
            return dp[i][sum]==1?true:false;
        }
        boolean isPart = checkPartition(nums, i+1, sum+nums[i], aim, dp) || checkPartition(nums, i+1, sum, aim, dp);
        dp[i][sum] = isPart==true?1:2;
        return isPart;
    }
    public static void main(String[] args) {
        int[] nums = {14,9,8,4,3,2};
        canPartition(nums);
        
    }
}
