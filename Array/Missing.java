import java.util.Arrays;
import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int j = s.nextInt();
        Arrays.sort(arr);
        int k = 0;
        for(int i=1;i<=arr.length;i++){
            if(arr[i-1]!=i+k){
                System.out.println(i+k);
                k++;
                i-=1;
            }
        }
        for(int i = arr[n-1]+1;i<=j;i++){
            System.out.println(i);
        }
    }
}
