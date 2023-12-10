import java.util.ArrayList;
import java.util.List;

public class Parenthesis2 {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> finalResult = new ArrayList<String>();
        Parentheses(0, 0, n, sb, finalResult);
        return finalResult;
    }
    public void Parentheses( int opening , int closing, int n, StringBuilder sb, List<String> result ){
        if(sb.length()==(n*2)){
            result.add(sb.toString());
            return;
        }
        if(opening<n){
            sb.append("(");
            Parentheses(opening+1, closing, n, sb, result);
            // BackTracking
            sb.deleteCharAt(sb.length()-1);
        }
        if(closing<opening){
            sb.append(")");
            Parentheses(opening, closing+1, n, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


// Rules
// If we put closing bracket, we must have opening
// Brackets should be less than equal to n