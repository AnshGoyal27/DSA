public class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        int max = lcs(0, 0, text1, text2, dp);
        return max;
    }
    public int lcs(int i, int j, String text1, String text2, int[][] dp){
        if(i>=text1.length() || j>=text2.length()){
            return 0;
        }
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            if(text1.charAt(i)==text2.charAt(j)){
                dp[i][j] = 1 + lcs(i+1, j+1, text1, text2, dp);
            }
            else{
                dp[i][j] = Math.max(lcs(i+1, j, text1, text2, dp), lcs(i, j+1, text1, text2, dp));
            }
            return dp[i][j];
        }
    }
}
