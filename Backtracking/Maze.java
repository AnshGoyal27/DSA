import java.util.ArrayList;

public class Maze {
    ArrayList<String> reachEnd(int vertical, int horizontal, int endH, int endV){
        if(vertical > endV){
            // More vertical than allowed
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if(horizontal > endH){
            // More horizontal than allowed
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if(vertical == endV && horizontal == endH){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // Move
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> gotAns = reachEnd(vertical+1, horizontal, endH, endV);
        for(String str:gotAns){
            list.add("V"+str);
        }
        gotAns = reachEnd(vertical, horizontal+1, endH, endV);
        for(String str:gotAns){
            list.add("H"+str);
        }
        gotAns = reachEnd(vertical+1, horizontal+1, endH, endV);
        for(String str:gotAns){
            list.add("D"+str);
        }
    return list;
    }
    public static void main(String[] args) {
        Maze m = new Maze();
        ArrayList<String> ans = m.reachEnd(0, 0, 3, 3);
        for(String str:ans){
            System.out.println(str);
        }
    }
}
