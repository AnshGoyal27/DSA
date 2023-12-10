package SingleBranch;
public class Armstrong {

    static int Sum(int n, int count){
        if(n==0){
            return 0;
        }
        return (n%10)^count + Sum(Math.floorDiv(n, 10),count);
    }

    static int count(int n){
        if(n==0){
            return 0;
        } 
        return  1 + count(n/10);
    }

    public static void main(String[] args) {
        System.out.println(count(12345));
    }
}
