import java.util.ArrayList;
import java.util.List;

public class NQueen {
    static public List<List<String>> solveNQueens(int n) {
        int[] x = new int[n];
        for(int i=0; i<n;i++){
            x[i] = -1;
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        List<List<String>> finalAns = new ArrayList<List<String>>();
        solveQueens(n, 0, x, ans);
        for (List<String> list : ans) {
            List<String> finalList = new ArrayList<String>();
            for (String str : list) {
                String finalStr = new String();
                int i = 0;
                for(;i<Integer.parseInt(str);i++){
                    finalStr+=".";
                }
                finalStr+="Q";
                i++;
                for(;i<n;i++){
                    finalStr+=".";
                }
                finalList.add(finalStr);
            }
             finalAns.add(finalList);
        }
        return finalAns;
    }
    static public void solveQueens( int n, int j ,int[] x, List<List<String>> ans){
        if(j==n){
            List<String> finalAnswer = new ArrayList<String>();
            for(int i =0 ;i<n;i++){
                finalAnswer.add(String.valueOf(x[i]));
            }
            ans.add(finalAnswer);
            return;
        }
        for(int i=0;i<n;i++){
            x[j] = i;
            if(isPlace(i, j, x)){
                solveQueens(n, j+1, x, ans);
            }
        }
    }
    static public boolean isPlace(int i, int j, int[] x){
        for(int k = j-1; k>=0; k--){
            if(x[k]==i){
                return false;
            }
            else if(((x[k]-k) == (i-j)) || ((x[k]+k) == (j+i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // List<List<String>> ans = solveQueens(4,0);
        // for (List<String> list : ans) {
        //     for (String list2 : list) {
        //         System.out.print(list2);
        //     }
        //     System.out.println();
        // }
        List<List<String>> ans = solveNQueens(4);
        System.out.println(ans);
    }

}
