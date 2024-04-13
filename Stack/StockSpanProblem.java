package Stack;

import java.util.Stack;

/**
 * StockSpanProblem
 */
public class StockSpanProblem {
    public static void main(String[] args) {
        // int stocks[] = {100,75,65,70,65,75,85};
        // for(int i=0;i<stocks.length;i++){
        //     int spanDays = 1;
        //     for(int j=i-1; j>=0 && stocks[j]<=stocks[i];j--){
        //         spanDays++;
        //         System.out.println(spanDays+" ");
        //     }
        // }
        int stocks[] = {100,75,65,70,65,75,85};
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int spanDays = 0;es
        for(int i=1;i<stocks.length;i++){
            while(!stack.isEmpty() && stocks[stack.peek()] <= stocks[i]){
                stack.pop();
            }
            spanDays = stack.isEmpty()?i+1:i-stack.peek();
            System.out.println(spanDays+" ");
            stack.push(i);
        }
    }
    
}   