package SingleBranch;
public class Digits {
    static void show(int n){
        if(n==0){
            return;
        }
        System.out.println(n%10);
        show(Math.floorDiv(n,10));
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        show(64800);
    }
}
