    
public class p5 {
    static int a = 65;
    static void starPrint(int noStar){
        if(noStar == 0){
            return;
        }
        System.out.print((char)a);
        a++;
        starPrint(noStar-1);
    }
    static void linePrint(int lines, int max){
        if(lines==max+1){
            return;
        }
        starPrint(lines);
        System.out.println();
        linePrint(lines+1,max);
    }
    public static void main(String[] args) {
        final int MAX_LINES = 5;
        linePrint(1,MAX_LINES);
    }
}
