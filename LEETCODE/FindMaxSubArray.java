public class FindMaxSubArray {
    static public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        for(int i = 0; i<=k-1; i++){
            avg+=nums[i];
        }
        double max = avg/k;
        for(int i=k;i<nums.length;i++){
            avg = avg + (nums[i]) - (nums[i-k]);
            if((avg/k)>max){
                max = avg/k;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        findMaxAverage(arr, 4);
    }
}
