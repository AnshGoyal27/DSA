
public class P8 {
    static void starPrint(int noStar){
        if(noStar == 0){
            return;
        }
        System.out.print("* ");
        starPrint(noStar-1);
    }
    static void spaces(int no){
        if(no==0){
            return;
        }
        System.out.print(" ");
        spaces(no-1);
    }
    static void linePrint(int lines,int max){
        if(lines==0){
            return;
        }
        // starPrint(lines);
        // System.out.println();
        linePrint(lines-1,max);
        spaces(max-lines);
        starPrint(lines);
        System.out.println();
    }
    public static void main(String[] args) {
        final int MAX_LINES = 5;
        linePrint(MAX_LINES,MAX_LINES);
    }
}
