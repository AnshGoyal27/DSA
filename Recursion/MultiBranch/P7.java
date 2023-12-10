public class P7 {
    static void starPrint(int noStar,boolean flag){
        if(noStar == 0){
            return;
        }
        if(flag == true){
            System.out.print("1");
            starPrint(noStar-1,!flag);
        }
        else{
            System.out.print("0");
            starPrint(noStar-1,!flag);
        }
        
    }

    static void linePrint(int lines){
        if(lines==0){
            return;
        }
        linePrint(lines-1);
        starPrint(lines,true);
        System.out.println();
    }
    public static void main(String[] args) {
        final int MAX_LINES = 5;
        linePrint(MAX_LINES);
    }
}
