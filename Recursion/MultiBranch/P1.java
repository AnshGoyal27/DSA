public class P1 {

    static void starPrint(int noStar){
        if(noStar == 0){
            return;
        }
        System.out.print("*");
        starPrint(noStar-1);
    }

    static void linePrint(int lines){
        if(lines==0){
            return;
        }
        starPrint(lines);
        System.out.println();
        linePrint(lines-1);
        // starPrint(lines);
        // System.out.println();
    }
    public static void main(String[] args) {
        final int MAX_LINES = 5;
        linePrint(MAX_LINES);
    }
}
