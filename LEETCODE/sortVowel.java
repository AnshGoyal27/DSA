import java.util.Comparator;
import java.util.PriorityQueue;

public class SortVowel {
    static public String sortVowels(String s) {
        PriorityQueue<Character> q = new PriorityQueue<Character>(new Comparator<Character>() {
            public int compare(Character c1, Character c2){
                if(c1>c2){
                    return 1;
                }
                else if(c1<c2){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                q.add(Character.valueOf(c));
            }
        }
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                s1.append(q.poll());
            }else{
                s1.append(c);
            }
        }
        return s1.toString();
    }
    static public boolean isVowel(char c){
        switch (c) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'A':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde")); 
    }
}
