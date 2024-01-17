import java.util.ArrayList;
import java.util.List;

public class PascalString {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row0 = new ArrayList<Integer>();
        row0.add(1);
        ans.add(row0);
        
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
