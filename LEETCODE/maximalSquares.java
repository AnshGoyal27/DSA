public class MaximalSquares {
    static public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        maxSquare(matrix, matrix.length, dp);
        int max = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(dp[i][j]>max){
                    max = dp[i][j];
                }
            }
        }
        return max*max;
    }
    static public void maxSquare(char[][]matrix, int max, int[][] dp){
        if(max==1){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    dp[i][j] = Character.getNumericValue(matrix[i][j]);
                }
            }
            return;
        }
        else{
            maxSquare(matrix, max-1, dp);            
            for(int i=0;i<matrix.length-max+1;i++){
                for(int j=0;j<matrix[0].length-max+1;j++){
                    if(dp[i][j]==(max-1)){
                        if(dp[i+1][j]==(max-1) && dp[i][j+1]==(max-1) && dp[i+1][j+1]==(max-1)){
                            dp[i][j]=max;
                        }
                    }
                }
            }
            return;
        }
    }

    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        maximalSquare(matrix);
    }
}
