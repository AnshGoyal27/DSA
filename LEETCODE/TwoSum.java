import java.util.Arrays;

/**
 * TwoSum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] nums2 = nums.clone();
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(nums[i]+nums[j]!=target){
            if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        int k = -1;
        int l = -2;
        for(int z = 0; z<nums2.length; z++){
            if(nums2[z] == nums[i] && k==-1){
                k=z;
            }
            else if(nums2[z] == nums[j]){
                l=z;
            }
        }
        int[] arr = {k,l};
        return arr;
    }

}