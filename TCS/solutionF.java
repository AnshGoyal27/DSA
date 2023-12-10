import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class solutionF {
    static int shortest = Integer.MAX_VALUE;
    static public void path(int i, int j, int curri, int currj, int[][] arr, int sum, ArrayList<Integer> sol){
        // System.out.println("i: "+curri+" j: "+currj+" Sum: "+sum);
        if(curri>i || currj>j || curri<0 || currj<0){
            return;
        }
        if(sum>shortest){
            return;
        }
        if(curri==i && currj==j){
            sol.add(Integer.valueOf(sum));
            shortest = sum;
            System.out.println(shortest);
            System.out.println(curri+" "+currj);
            return;
        }
        else{
            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
                    pQueue.add(arr[i+1][j]);
                    pQueue.add(arr[i][j+1]);
                    pQueue.add(arr[i+1][j+1]);
                if(i>0){
                    pQueue.add(arr[i-1][j+1]);
                    pQueue.add(arr[i-1][j]);
                }
                if(j>0){
                    pQueue.add(arr[i][j-1]);
                    pQueue.add(arr[i+1][j-1]);
                }
                if(i>0 && j>0){
                    pQueue.add(arr[i-1][j-1]);
                }
            int a = pQueue.poll();
            int c = pQueue.poll();
            int b = arr[i+1][j];
            if((b-a)==0 && a!=c){
                path(i, j, curri+1, currj, arr, sum, sol);
            }
            else{
                path(i, j, curri+1, currj, arr, sum+(a-b+1), sol);
            }
            b = arr[i+1][j+1];
            if((b-a)==0 && a!=c){
                path(i, j, curri+1, currj+1, arr, sum, sol);
            }
            else{
                path(i, j, curri+1, currj+1, arr, sum+(a-b+1), sol);
            }
            b = arr[i][j+1];
            if((b-a)==0 && a!=c){
                path(i, j, curri, currj+1, arr, sum, sol);
            }
            else{
                path(i, j, curri, currj+1, arr, sum+(a-b+1), sol);
            }
            if(i>0){
                b = arr[i-1][j+1];
                if((b-a)==0 && a!=c){
                    path(i, j, curri-1, currj+1, arr, sum, sol);
                }
                else{
                    path(i, j, curri-1, currj+1, arr, sum+(a-b+1), sol);
                }
                 b = arr[i-1][j];
                if((b-a)==0 && a!=c){
                    path(i, j, curri-1, currj, arr, sum, sol);
                }
                else{
                    path(i, j, curri-1, currj, arr, sum+(a-b+1), sol);
                }
            }
            if(j>0){
                b = arr[i+1][j-1];
                if((b-a)==0 && a!=c){
                    path(i, j, curri+1, currj-1, arr, sum, sol);
                }
                else{
                    path(i, j, curri+1, currj-1, arr, sum+(a-b+1), sol);
                }
                 b = arr[i][j-1];
                if((b-a)==0 && a!=c){
                    path(i, j, curri, currj-1, arr, sum, sol);
                }
                else{
                    path(i, j, curri, currj-1, arr, sum+(a-b+1), sol);
                }
            }
            if(i>0 && j>0){
                b = arr[i-1][j-1];
                if((b-a)==0 && a!=c){
                    path(i, j, curri-1, currj-1, arr, sum, sol);
                }
                else{
                    path(i, j, curri-1, currj-1, arr, sum+(a-b+1), sol);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, col;
        row = s.nextInt();
        col = s.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int curri = s.nextInt()-1;
        int currj = s.nextInt()-1;
        int i = s.nextInt()-1;
        int j = s.nextInt()-1;
        ArrayList<Integer> sol = new ArrayList<Integer>();
        path(i, j, curri, currj, arr, 0, sol);
        for (Integer integer : sol) {
            System.out.println(integer);
        }
    }
}
