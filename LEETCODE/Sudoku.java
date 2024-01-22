import java.util.List;

public class Sudoku {
    static public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    // static public void solver(char[][] board, int row, int col){
    //     if(row==9){
    //         for(int i=0;i<9;i++){
    //             for(int j=0;j<9;j++){
    //                 System.out.print(board[i][j]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     else if(col==9){
    //         solver(board,row+1,0);
    //     }
    //     else{
    //         if(board[row][col]=='.'){
    //             for(int i=0;i<9;i++){
    //                 char digit = (char)(i+'1');
    //                 if(isValid(row, col, digit, board)){
    //                     board[row][col] = digit;
    //                     solver(board, row, col+1 );
    //                 }
    //             }
    //             board[row][col]='.';
    //         }
    //         else{
    //             solver(board, row, col+1);
    //         }
    //     }
    // }
    static public boolean solver(char[][] board, int row, int col){
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return true;
        }
        else if(col==9){
            return solver(board,row+1,0);
        }
        else{
            if(board[row][col]=='.'){
                for(int i=0;i<9;i++){
                    char digit = (char)(i+'1');
                    if(isValid(row, col, digit, board)){
                        board[row][col] = digit;
                        if(solver(board, row, col+1 )){
                            return true;
                        }
                    }
                }
                board[row][col]='.';
                return false;
            }
            else{
                return solver(board, row, col+1);
            }
        }
    }
    static public boolean isValid(int row, int col, char no, char[][] board){
        for(int i=0;i<9;i++){
            if(board[row][i]==no || board[i][col]==no){
                return false;
            }
        }
        if(row<=2){
            if(col<=2){
                return checkBox(0, 0, 2, 2, no, board);
            }
            else if(col<=5){
                return checkBox(0, 3, 2, 5, no, board);
            }
            else{
                return checkBox(0, 6, 2, 8, no, board);
            } 
        }
        else if(row<=5){
            if(col<=2){
                return checkBox(3, 0, 5, 2, no, board);
            }
            else if(col<=5){
                return checkBox(3, 3, 5, 5, no, board);
            }
            else{
                return checkBox(3, 6, 5, 8, no, board);
            } 
        }
        else{
            if(col<=2){
                return checkBox(6, 0, 8, 2, no, board);
            }
            else if(col<=5){
                return checkBox(6, 3, 8, 5, no, board);
            }
            else{
                return checkBox(6, 6, 8, 8, no, board);
            } 
        }
    }
    static public boolean checkBox(int startR, int startC, int endR, int endC, char no, char[][] board){
        for(int i=startR; i<=endR; i++){
            for(int j=startC; j<=endC; j++){
                if (board[i][j]==no) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(board);
    }
}
