
public class P9 {
    static void spaces(int no){
        if(no==0){
            return;
        }
        System.out.print(" ");
        spaces(no-1);
    }
    static void starPrint(int no){
        if(no==0){
            return;
        }
        System.out.print("* ");
        starPrint(no-1);
    }
    static void linePrint(int no, int max){
        if(no==0){
            return;
        }
        spaces(max - no);
        starPrint(no);
        System.out.println();
        linePrint(no-1,max);
    }

    static void printLines(int no,int max){
        if(no==0){
            return;
        }
        if(no==max){
            spaces(max - no);
            starPrint(no);
            System.out.println();
            linePrint(no-1, max);
            return;
        }
        spaces(max-no);
        starPrint(no);
        System.out.println();
        printLines(no+1,max);
    }
    public static void main(String[] args) {
        final int MAX_LINES = 5;
        printLines(1, MAX_LINES);
    }
}
