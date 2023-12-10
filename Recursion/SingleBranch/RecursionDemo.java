package SingleBranch;
/*
 * When function calls itself it creates a cycle at certain point
 * to stop cycle we need termination case or base case
 * It needs to be stopped at a certain point else it goes infinite
 * and it gives stack overflow error
 */

public class RecursionDemo {

    static void show1ToN(int n){
        // termination case or base case
        if(n==0){
            return;
        }

        // Recursion Cycle (Loop)
        show1ToN(n-1); // stack build
        // stack pop ( this line runs after return )
        System.out.println(n);

    }

    static void showNTo1(int n){
        // termination case or base case
        if(n==0){
            return;
        }
        System.out.println(n);
        // Recursion Cycle (Loop)
        showNTo1(n-1); // Tail Recursion - Really Fast
    }

    static void show(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        show(n-1);
        System.out.println(n);
    }



    public static void main(String[] args) {
        show1ToN(5);
        showNTo1(5);
        show(5);
    }
}
