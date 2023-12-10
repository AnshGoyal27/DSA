public class WaystoSplit {
    public int waysToSplitArray(int[] nums) {
        long sumE = 0;
        for(int i=0;i<nums.length;i++){
            sumE+=nums[i];
        }
        int split = 0;
        long sumS = 0;
        for(int i=0;i<nums.length-1;i++){
            sumE-=nums[i];
            sumS+=nums[i];
            if(sumS>=sumE){
                split+=1;
            }
        }
        return split;
    }
}
