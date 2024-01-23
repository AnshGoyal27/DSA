public class maxProductArray {
    static public int maxProduct(int[] nums) {
        int current = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            current = current==0?nums[i]:current*nums[i];
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        current = 0;
        for(int i=nums.length-1;i>=0;i--){
            current = current==0?nums[i]:current*nums[i];
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        maxProduct(nums);
    }
}
