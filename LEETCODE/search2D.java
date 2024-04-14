public class Search2D {
    // static public boolean searchMatrix(int[][] matrix, int target) {
    //     int i = 0;
    //     int j = matrix.length-1;
    //     if(matrix.length!=1){
    //         if(target<matrix[0][0]){
    //             return false;
    //         }
    //         if(target>matrix[matrix.length-1][matrix[0].length-1]){
    //             return false;
    //         }
    //         do{
    //             int mid = (i+j)/2;
    //             // System.out.println(matrix[mid][0]+" "+i+" "+j);
    //             if(matrix[j][0]==target){
    //                 return true;
    //             }
    //             if(matrix[mid][0]>target){
    //                 j=mid;
    //             }
    //             else{
    //                 i=mid;
    //             }
    //         }while(j-i>1);
    //     }
    //     // System.out.println(matrix[i][0]+" "+i+" "+j);
    //     // System.out.println();
    //     int row = (target-matrix[j][0]<0)?i:j;
    //     i = 0;
    //     j = matrix[i].length-1;
    //     if(matrix[row][i]==target){
    //         return true;
    //     }
    //     else if(matrix[row][j]==target){
    //         return true;
    //     }
    //     else{
    //         while(i<=j){
    //             System.out.println(matrix[row][i]+" "+i+" "+j+" "+matrix[row][j]);
    //                 int mid = (i+j)/2;
    //                 if(matrix[row][mid]==target){
    //                     return true;
    //                 }
    //                 else if(matrix[row][mid]<target){
    //                     i=mid+1;
    //                 }
    //                 else{
    //                     j=mid-1;
    //                 }
    //             }
    //         }
    //     return false;
    // }
    static public boolean searchMatrix(int[][] matrix, int target){
        for(int k=0;k<matrix.length;k++){
            if(matrix[k][0]>target){
                if(k==0){
                    return false;
                }
                else{
                    int row = k-1;
                    int i = 0;
                    int j = matrix[i].length-1;
                    if(matrix[row][i]==target){
                        return true;
                    }
                    else if(matrix[row][j]==target){
                        return true;
                    }
                    else{
                        while(i<=j){
                            System.out.println(matrix[row][i]+" "+i+" "+j+" "+matrix[row][j]);
                                int mid = (i+j)/2;
                                if(matrix[row][mid]==target){
                                    return true;
                                }
                                else if(matrix[row][mid]<target){
                                    i=mid+1;
                                }
                                else{
                                    j=mid-1;
                                }
                            }
                        }
                }
                break;
            }
            else if(matrix[k][0]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}};
        System.out.println(searchMatrix(matrix, 3));
    }
}
