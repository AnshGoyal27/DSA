import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest is: "+largest);
    }
}
