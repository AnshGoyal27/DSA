public class merge {
    static public void mergeArr(int a[], int b[]){
        int ap = 0;
        int bp = 0;
        int al = a.length;
        int bl = b.length;
        int c[] = new int[al+bl];
        int cp=0;
        while(ap<al && bp<bl){
            if(a[ap]<b[bp]){
                c[cp++] = a[ap++];
            }
            else{
                c[cp++] = b[bp++];
            }
        }
        while(ap<al){
            c[cp++] = a[ap++];
        }
        while(bp<bl){
            c[cp++] = a[ap++];
        }
        for (int i : c) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,5,9,10};
        int[] arr2 = {2,4,8};
        mergeArr(arr1, arr2);
    }
}
