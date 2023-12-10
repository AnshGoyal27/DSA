
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> f1 = new HashMap<Character,Integer>();
        Map<Character,Integer> f2 = new HashMap<Character,Integer>();

        for(int i=0; i<s1.length();i++){
            Character ch1 = Character.valueOf(s1.charAt(i));
            Character ch2 = Character.valueOf(s2.charAt(i));
            f1.put(ch1, f1.getOrDefault(ch1, 0)+1);
            f2.put(ch2, f2.getOrDefault(ch2, 0)+1);
        }

        return f1.equals(f2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        if(isAnagram(s1, s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        
    }
}
