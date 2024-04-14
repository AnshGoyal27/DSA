public class WordFind {
    static public boolean exist(char[][] board, String word) {
        char[][] checked = new char[board.length][board[0].length];
        char c = word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==c){
                    boolean found = find(board, word, i, j, 0,checked);
                    if(found){
                        return found;
                    }
                }
            }
        }
        return false;
        
    }

    static public boolean find(char[][] board, String word, int i, int j, int len, char[][] checked){
        if(len==word.length()){
            return true;
        }
        if(i>=board.length || j>=board[0].length || j<0 || i<0){
            return false;
        }
        System.out.println("I: "+i+" J: "+j+" Checked: "+checked[i][j]+" Len: "+len+" Word: "+board[i][j]);
        if(checked[i][j]=='T'){
            return false;
        }
        else if(board[i][j]==word.charAt(len)){
            checked[i][j]='T';
            boolean found = find(board, word, i+1, j, len+1,checked) || find(board, word, i, j+1, len+1,checked) || find(board, word, i-1, j, len+1, checked) || find(board, word, i, j-1, len+1, checked);
            if(!found){
                checked[i][j]='F';
            }
            return found;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        System.out.println(exist(board, "AAB"));
    }
}
