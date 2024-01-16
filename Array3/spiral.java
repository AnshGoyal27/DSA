public class spiral {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        int rowS = 0;
        int colS = 0;
        int rowE = arr.length-1;
        int colE = arr[0].length-1;

        while(colS<=colE && rowS<=rowE){
            for(int i=colS;i<=colE;i++){
                System.out.print(arr[rowS][i]+" ");
            }
            for(int i=rowS+1;i<=rowE;i++){
                System.out.print(arr[i][colE]+" ");
            }
            for(int i=colE-1;i>=colS;i--){
                System.out.print(arr[rowE][i]+" ");
            }
            for(int i=rowE-1;i>rowS;i--){
                System.out.print(arr[i][colS]+" ");
            }
            rowS++;
            rowE--;;
            colS++;
            colE--;
        }
    }
}
