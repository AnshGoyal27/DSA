import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombos {
    static public List<String> letterCombinations(String digits) {
        Map<Integer,String> keypad = new HashMap<Integer, String>(); 

        keypad.put(2,"abc");
        keypad.put(3,"def");
        keypad.put(4,"ghi");
        keypad.put(5,"jkl");
        keypad.put(6,"mno");
        keypad.put(7,"pqrs");
        keypad.put(8,"tuv");
        keypad.put(9,"wxyz");

        List<String> comb = Combinations(digits, 0, keypad);
        return comb;

    }

    static public List<String> Combinations(String digits, int j, Map<Integer, String> keypad){
        if(j==(digits.length()-1)){
            List<String> comb = new LinkedList<String>();
            String str = keypad.get(Character.getNumericValue(digits.charAt(j)));
            for(int i=0;i<str.length();i++){
                comb.add(String.valueOf(str.charAt(i)));
            }
            return comb;
        }
        else{
            List<String> comb = new LinkedList<String>();
            List<String> further = Combinations(digits, j+1, keypad);
            String str = keypad.get(Character.getNumericValue(digits.charAt(j)));
            for(int i=0;i<str.length();i++){
                for (String str2 : further) {
                    comb.add(String.valueOf(str.charAt(i))+str2);
                }
                
            }
            return comb;
        }
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("2345"));
    }
}
