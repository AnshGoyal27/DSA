package SingleBranch;
public class Prime {
    static boolean show(int n,int b){
        if(n==2){
            return true;
        }
        if(n==3){
            return true;
        }
        if(n%b==0){
            return false;
        }
        if(b==(n/2)){
            return true;
        } 
        b += 1;
        return show(n,b);
    }

    public static void main(String[] args) {
        System.out.println(show(3,2));
    }
    
}
