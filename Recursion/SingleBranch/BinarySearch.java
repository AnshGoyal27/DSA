package SingleBranch;
public class BinarySearch {
    static int search(int searchno, int high, int low,int arr[]){
        if(high<low){
            return -1;
        }
        int mid = (high + low)/2;
        if(arr[mid]==searchno){
            return mid;
        }
        else if(arr[mid]>searchno){
            return search(searchno, mid-1, low, arr);
        }
        else{
            return search(searchno, high, mid+1, arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        System.out.println(search(5, arr.length-1, 0, arr));
    }
}
