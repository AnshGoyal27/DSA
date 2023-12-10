package SingleBranch;
import java.util.Scanner;

public class Stars {
    static void iterate(String s, char c, int index){
        if(index == 1){
            System.out.print(c);
        }
        if(index == s.length()){
            System.out.println();
            return;
        }
        if(c == s.charAt(index)){
            System.out.print(" * "+s.charAt(index));
            iterate(s, s.charAt(index), index+1);
        }
        else{
            System.out.print(" "+s.charAt(index));
            iterate(s, s.charAt(index), index+1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        iterate(in,in.charAt(0),1);
        s.close();
    }
}
