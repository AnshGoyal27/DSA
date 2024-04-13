
import java.util.LinkedList;

public class palindrome {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        boolean palin = true;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=list.get(list.size()-1-i)){
                palin = false;
            }
        }
        System.out.println(palin);

    }
    
}