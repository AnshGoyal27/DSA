static public boolean exist(char[][] board, String word) {
    //     char[][] checked = new char[board.length][board[0].length];
    //     return find(board, word, 0, 0, 0);
    // }
    // static public boolean find(char[][] board, String word, int i, int j, int len){
    //     if(len==word.length()-1){
    //         return true;
    //     }
    //     if(i>=board.length || j>=board.length){
    //         return false;
    //     }
    //     if(board[i][j]==word.charAt(len) && board[i][j]==null){

    //         return find(board, word, i+1, j, len+1) || find(board, word, i, j+1, len+1);
    //     }
    //     else{
    //         return find(board, word, i+1, j, 0) || find(board, word, i, j+1, 0);
    //     }
        
    // }