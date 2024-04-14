public class RotateMatrix {
    static public void rotate(int[][] matrix) {
        int temp;
        for(int i=0;i<=matrix.length/2;i++){
            for(int j=i;j<matrix.length-i-1;j++){
                System.out.println(matrix[i][j]+" "+matrix[j][matrix.length-i-1]+" "+matrix[matrix.length-i-1][matrix.length-j-1]+" "+matrix[matrix.length-j-1][i]);
                temp = matrix[matrix.length-j-1][i];
                matrix[matrix.length-j-1][i] = matrix[matrix.length-i-1][matrix.length-j-1];
                matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];
                matrix[j][matrix.length-i-1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
