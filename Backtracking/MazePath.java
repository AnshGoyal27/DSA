import java.util.ArrayList;

public class MazePath {
    void reachEnd(int vertical, int horizontal, int endH, int endV, String result){
        if(vertical > endV){
            // More vertical than allowed
            return;
        }
        if(horizontal > endH){
            // More horizontal than allowed
            return;
        }
        if(vertical == endV && horizontal == endH){
            System.out.println(result);            
            return;
        }
        // Move
        reachEnd(vertical+1, horizontal, endH, endV, result+"V");
        reachEnd(vertical, horizontal+1, endH, endV, result+"H");
        
    return list;
    }
    public static void main(String[] args) {
        
    }
}
