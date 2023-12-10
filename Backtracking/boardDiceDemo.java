public class boardDiceDemo {
    static void diceBoardGame(int start, int end, String result){
        if(start==end){
            System.out.println(result);
            return;
        }
        if(start>end){
            return;
        }
        // 6 Possibilities
        for(int dice = 1; dice <= 6; dice++){
            diceBoardGame(start+dice, end, result+dice);
        }
    }
    public static void main(String[] args) {
        diceBoardGame(0, 10, "");
    }
}
