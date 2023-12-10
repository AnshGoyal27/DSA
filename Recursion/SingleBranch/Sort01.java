package SingleBranch;
public class Sort01 {
    static void sort(int arr[],int C0, int C1,int index){
        if(index<arr.length){
            if(arr[index]==0){
                C0++;
            }
            else{
                C1++;
            }
            sort(arr, C0, C1, index+1);
        }
        else{
            for(int i=0;i<C0;i++){
                arr[i] = 0;
            }
            for(int j=C0;j<arr.length;j++){
                arr[j] = 1;
            }
        }
        
    }
}
