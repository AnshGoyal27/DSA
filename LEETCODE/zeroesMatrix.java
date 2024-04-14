public class ZeroesMatrix {

    static public void setZeroes(int[][] matrix) {
        boolean firstC = false;
        boolean firstR = false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstC = true;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstR = true;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(firstC){
                matrix[i][0]=0;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(firstR){
                matrix[0][i]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,7,2,8,2},{2,2,4,1,8},{0,5,7,6,3},{8,1,0,7,7},{1,3,7,4,1},{6,5,5,6,3},{7,1,0,1,9},{5,4,4,9,7},{2,2,4,1,0},{7,1,1,9,1},{8,0,4,7,6},{7,5,1,2,3},{7,2,5,9,3}};
        setZeroes(matrix);
        
    }
}
