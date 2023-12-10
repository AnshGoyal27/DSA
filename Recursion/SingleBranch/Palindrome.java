package SingleBranch;
public class Palindrome {

    static int count(int n){
        if(n==0){
            return 0;
        } 
        return  1 + count(n/10);
    }

    public static void main(String[] args) {
        
    }
}
