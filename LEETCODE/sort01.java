public class Sort01 {
    static public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length-1;
            while(i<nums.length && nums[i]==0){
                i++;
            }
            while(j>=0 && nums[j]==2){
                j--;
            }
            int k = i;
            while(k<=j){
                if(nums[k]==0){
                    swap(nums, i, k);
                    i++;
                    k++;
                }
                else if(nums[k]==2){
                    swap(nums, k, j);
                    j--;
                }
                else{
                    k++;
                }
            }
    }

    static public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,0,0,2,0,1,2,0,2};
        sortColors(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
