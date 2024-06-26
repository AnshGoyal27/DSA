public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int result[] = new int[nums.length];
        int index = result.length - 1;
        while(index>=0){
            int value;
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                value = nums[right];
                right--;
            }
            else{
                value = nums[left];
                left++;
            }
            result[index] = value * value;
            index--;
        }
        return result;
    }
}
