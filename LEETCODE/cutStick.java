
public class CutStick {
    static public int minCost(int n, int[] cuts) {
        int[] cost = new int[1];
        int[] calculated = new int[cuts.length];
        cost[0] = Integer.MAX_VALUE;
    }
    static public void FindCost(int n, int[] cuts, int[] calculated, int i, int j){

    }
    
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   
    public static void main(String[] args) {
        int[] cuts = {1,3,4,5};
        minCost(7, cuts);
    }
}
