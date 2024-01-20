public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] arr = new int[m];
        for(int k=0;k<m;k++){
            arr[k]=nums1[k];
        }
        int k=0;
        while(i<m && j<n){
            if(arr[i]<=nums2[j]){
                nums1[k++]=arr[i++];
            }
            else{
                nums1[k++]=nums2[j++];
            }
        }
        while(i<m){
            nums1[k++]=arr[i++];
        }
        while(j<n){
            nums1[k++]=nums2[j++];
        }
    }
}
