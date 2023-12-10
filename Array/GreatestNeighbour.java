import java.util.Scanner;

public class GreatestNeighbour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Size: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        if(n==0){
            System.out.print("Empty");
        }
        else if(n==1){
            System.out.print(arr[0]);
        }
        else{
            for (int i=0;i<arr.length;i++){
                if(i==0){
                    if(arr[i+1]<arr[i]){
                        System.out.print(arr[i]+" ");
                    }
                }
                else if(i== arr.length-1){
                    if(arr[i-1]<arr[i]){
                        System.out.print(arr[i]+" ");
                    }
                }
                else{
                    if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }

    }
}
