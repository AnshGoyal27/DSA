import java.util.Scanner;

public class NSmall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(i!=min){
                arr[i] = arr[i] + arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }
        int k = s.nextInt();
        if(k<=n){
            System.out.println(arr[k-1]);
        }
    }
}
