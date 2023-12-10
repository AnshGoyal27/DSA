import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    // static boolean isAnagram(String s1, String s2){
    //     char[] c1 = s1.toCharArray();
    //     char[] c2 = s2.toCharArray();
    //     Arrays.sort(c1);
    //     Arrays.sort(c2);
    //     if(c1.length != c2.length){
    //         return false;
    //     }
    //     boolean flag = true;
    //     for(int i=0;i<s1.length();i++){
    //         if(c1[i]!=c2[i]){
    //             System.out.println(c1[i]+" "+c2[i]);
    //             flag = false;
    //             break;
    //         }
    //     }
    //     return flag;
    // }

    // Best Case
    static boolean isAnagram(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1.length != c2.length){
            return false;
        }
        int[] alphabet = new int[26];
        for(int i=0;i<s1.length();i++){
            alphabet[s1.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s2.length();i++){
            alphabet[s2.charAt(i)-'a']-=1;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isAnagram("anagram", null)
    }
}
