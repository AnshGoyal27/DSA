import java.util.Scanner;

public class CountNeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int count = 0;
        for(int i: arr){
            if(i<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
