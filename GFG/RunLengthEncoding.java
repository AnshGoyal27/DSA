import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {
    public static void runLengthEncode(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character index = Character.valueOf(s.charAt(i));
            map.put(index, map.getOrDefault(index, 0)+1);
        }
        for (Map.Entry<Character, Integer> mapV : map.entrySet()) {
            System.out.print(mapV.getKey()+""+mapV.getValue());
        }
    }
    public static void main(String[] args) {
        runLengthEncode("aaabbcdaaggh");
    }
}
