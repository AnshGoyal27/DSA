import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    static public List<String> generateParenthesis(int n) {
        List<String> ans = Parentheses(n, 1);
        return ans;
    }
    static public List<String> Parentheses( int n, int j ){
        if(n==j){
            List<String> ans = new ArrayList<String>();
            ans.add("()");
            return ans;
        }
        else{
            List<String> further = Parentheses(n, j+1);
            List<String> ans = new ArrayList<String>();
            for (String string : further) {
                String a1 = string+"()";
                String a2 = "("+string+")";
                String a3 = "()"+string;
                if(!ans.contains(a1)){
                    ans.add(a1);
                }
                if(!ans.contains(a2)){
                    ans.add(a2);
                }
                if(!ans.contains(a3)){
                    ans.add(a3);
                }
            }
            return ans;
        }
    }
}
