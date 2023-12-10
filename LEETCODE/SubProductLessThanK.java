import java.util.ArrayList;

public class SubProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int countSubArray = 0;
        int product = 1;
        for(;right<nums.length;right++){
            product *= nums[right];
            while(product>=k && left<=right){
                product/=nums[left];
                left++;
            }
            countSubArray += right - left + 1;
        }
        return countSubArray;
        
    }
    public static void main(String[] args) {
        
    }
}
