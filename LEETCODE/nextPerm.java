import java.util.PriorityQueue;

public class nextPerm {
    static public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        else{
            int ptr1 = nums.length-1;
            int ptr2 = nums.length-2;
            if(nums[ptr1]>nums[ptr2]){
                swap(nums, ptr1, ptr2);
                return;
            }
            while(nums[ptr1]<=nums[ptr2]){
                if(ptr2==0){
                    reverse(nums);
                    return;
                }
                ptr1--;
                ptr2--;
            }
            ptr1 = nums.length-1;
            while(nums[ptr1]<=nums[ptr2] && ptr1>ptr2){
                ptr1--;
            }
            int ptr3 = ptr1;
            while(ptr1>ptr2){
                if(Math.abs(nums[ptr1]-nums[ptr2])<=Math.abs(nums[ptr3]-nums[ptr2]) && nums[ptr1]>nums[ptr2]){
                    ptr3=ptr1;
                }
                ptr1--;
            }
            swap(nums, ptr1, ptr3);
            sort(nums, ptr1+1);
        }
    }

    static public void sort(int[] arr,int start){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=start;i<arr.length;i++){
            pq.add(Integer.valueOf(arr[i]));
        }
        for(int i=start;i<arr.length;i++){
            arr[i]=pq.poll();
        }
    }

    static public void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            swap(arr, i, arr.length-1-i);
        }
    }

    static public void swap(int[]arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args) {
        int[] num = {1,5,1};
        nextPermutation(num);
        for (int i : num) {
            System.out.println(i);
        }
    }
}
