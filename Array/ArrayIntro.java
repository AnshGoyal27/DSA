public class ArrayIntro {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for(int i=1;i<=10;i++){
            arr[i-1]=2*i;
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
