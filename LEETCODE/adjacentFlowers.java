public class AdjacentFlowers {
    // static public int[] gardenNoAdj(int n, int[][] paths) {
    //     int[] flowers = new int[n];
    //     fillGarden(n-1, paths, flowers);
    //     return flowers;

    // }
    // static public boolean fillGarden(int n, int[][] paths, int[] flowers){
    //     if(n<0){
    //         for(int i=0;i<flowers.length;i++){
    //             System.out.print(flowers[i]+" ");
    //         }
    //         System.out.println();
    //         return true;
    //     }
    //     for(int i=1;i<=4;i++){
    //         flowers[n] = i;
    //         if(check(paths, flowers, i, n)){
    //             boolean find = fillGarden(n-1, paths, flowers);
    //             if (find) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // static public boolean check(int[][] paths, int[] flowers, int i, int n){
    //     for(int j=0;j<paths.length;j++){
    //         if((paths[j][0]-1)==n){
    //             if(flowers[paths[j][1]-1]==i){
    //                 return false;
    //             }
    //         }
    //         else if((paths[j][1]-1)==n){
    //             if(flowers[paths[j][0]-1]==i){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    static public int[] gardenNoAdj(int n, int[][] paths) {
        int[] flowers = new int[n];
        flowers[0]=1;
        for(int i=0;i<paths.length;i++){
            if(flowers[paths[i][0]-1]!=0){
                if(flowers[paths[i][1]-1]==0 || flowers[paths[i][0]-1]==flowers[paths[i][1]-1]){
                    flowers[paths[i][1]-1]=flowers[paths[i][0]-1]+1;
                }
            }
            else if(flowers[paths[i][1]-1]!=0){
                if(flowers[paths[i][0]-1]==0 || flowers[paths[i][0]-1]==flowers[paths[i][1]-1]){
                    flowers[paths[i][0]-1]=flowers[paths[i][1]-1]+1;
                }
            }
            else{
                flowers[paths[i][0]-1]=1;
                flowers[paths[i][1]-1]=2;
            }
        }
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i]+" ");
        }
        return flowers;
    }
    public static void main(String[] args) {
        int[][] paths = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
        gardenNoAdj(4, paths);
    }
}
