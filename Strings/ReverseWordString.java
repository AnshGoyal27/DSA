// The sky is blue
// Blue is sky the

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseWordString {
    static public String reverse(String s){
        String word = "";
        List<String> ans = new ArrayList<String>();

        for(int i=0;i<=s.length();i++){
            if((i==s.length() || s.charAt(i)==' ') && word.length()!=0){
                ans.add(word);
                word="";
            }
            else{
                word+=String.valueOf(s.charAt(i));
            }
        }
        word = "";
        for(int i=ans.size()-1;i>=0;i--){
            word+=ans.get(i);
            word+=" ";
        }

        // Also can use String[] words = str.split("\\s+");
        return word;
    }
    public static void main(String[] args) {
        System.out.println(reverse("The sky is Blue"));
    }
}
