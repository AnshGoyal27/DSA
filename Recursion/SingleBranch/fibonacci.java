package SingleBranch;
public class fibonacci {
    static int fibonacci(int num){
        if(num==0 || num==1){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

    static void fibonacci2(int num){
        
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(fibonacci(i));
        }
    }
}
