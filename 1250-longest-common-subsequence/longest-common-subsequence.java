class Solution {
    public int longestCommonSubsequence(String str, String str2) {
        int[][] dp=new int[str.length()+1][str2.length()+1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }


        return dp[str.length()][str2.length()];
    }
}