package SingleBranch;
public class SumOddEven {

    static int SumE(int n, int i){
        if(n==0){
            return 0;
        }
        if(i%2==0){
            return (n%10) + SumE(Math.floorDiv(n, 10), i+1);
        }
        else{
            return 0 + SumE(Math.floorDiv(n, 10), i+1);
        }
    }
    static int SumO(int n, int i){
        if(n==0){
            return 0;
        }
        if(i%2!=0){
            return (n%10) + SumO(Math.floorDiv(n, 10), i+1);
        }
        else{
            return 0 + SumO(Math.floorDiv(n, 10), i+1);
        }
    }
    static void sumOfEvenOdd( int num, int evenSum, int oddSum ){
        if(num==0){
            System.out.println(evenSum + " " + oddSum);
            return;
        }
        int digit = num % 10;
        if( digit%2==0 ){
            evenSum+=digit;
        }
        else{
            oddSum+=digit;
        }
        sumOfEvenOdd(Math.floorDiv(num, 10),evenSum,oddSum);
        return;
    }

    static int[] sumOfEvenOdd(int num){
        // int[] arr  = new int[2];
        // if(num==0){
        //     return arr;
        // }
        // int digit = num%10;
        // if(digit%2==0){
        //     arr[0]+=digit;
        // }
        // else{
        //     arr[1]+=digit;
        // }
        // int[] arr2 = sumOfEvenOdd(num/10);
        // arr[0] += arr2[0];
        // arr[1] += arr2[1];
        // return arr;

        if(num==0){
            return new int[2];
        }
        int arr[] = sumOfEvenOdd(num/10);
        int digit = num%10;
        if(digit%2==0){
            arr[0]+=digit;
        }
        else{
            arr[1]+=digit;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(SumE(12345678, 0));
        System.out.println(SumO(12345678, 0));
        System.out.println(sumOfEvenOdd(1234)[1]);
    }
}
