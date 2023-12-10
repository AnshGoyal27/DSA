package Array2;

public class Sum {
    void sum( int arr[], int sum ){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            if(arr[start]+arr[end] == sum){
                System.out.println(start+end);
                break;
            }
            else if(arr[start]+arr[end]>sum){
                end-=1;
            }
            else if(arr[start]+arr[end]<sum){
                start++;
            }
        }
        return;
    }
}
