public class Duplicate {
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]==nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    //     return nums[0];
    // }
    static public int findDuplicate(int[] nums){
        int i = 0;
        while(nums[i]>0){
            nums[i]*=(-1);
            i=nums[i]*(-1);
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        findDuplicate(nums);
        System.out.println();
        int[] nums2 = {3,1,3,4,2};
        findDuplicate(nums2);
    }
}
