public class MinPath {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int min = mini(dp,grid,0,0);
        return min;
    }
    public int mini(int[][] dp, int[][] grid, int i, int j){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        else if(i==grid.length-1){
            if(dp[i][j]!=0){
                return dp[i][j];
            }
            dp[i][j] = grid[i][j] + mini(dp, grid, i, j+1);
            return dp[i][j];
        }
        else if(j==grid[0].length-1){
            if(dp[i][j]!=0){
                return dp[i][j];
            }
            dp[i][j] = grid[i][j] + mini(dp, grid, i+1, j);
            return dp[i][j];
        }
        else{
            if(dp[i][j]!=0){
                return dp[i][j];
            }
            dp[i][j] = grid[i][j] + Math.min(mini(dp,grid,i+1,j),mini(dp,grid,i,j+1)); 
            return dp[i][j];
        }
    }
}
