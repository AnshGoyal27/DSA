
public class P4 {
    static void starPrint(int noStar,int printNo){
        if(noStar == 0){
            return;
        }
        System.out.print(printNo);
        starPrint(noStar-1,printNo);
    }
    static void linePrint(int lines, int max){
        if(lines==max+1){
            return;
        }
        starPrint(lines,lines);
        System.out.println();
        linePrint(lines+1,max);
    }
    public static void main(String[] args) {
        final int MAX_LINES = 5;
        linePrint(1,MAX_LINES);
    }
}
