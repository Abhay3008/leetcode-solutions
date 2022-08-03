class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
        int count[][] = new int[strs.length][2];
        int dp[][][] = new int[strs.length][m+1][n+1];
        for(int i = 0;i<strs.length;i++)
            for(int j = 0;j<m+1;j++)
                for(int k = 0;k<n+1;k++)
                    dp[i][j][k]=-1;
        for(int i = 0;i<strs.length;i++){
            int x=0,y=0;
            for(int j = 0;j<strs[i].length();j++){
                if(strs[i].charAt(j)=='0')
                    x++;
                else
                    y++;
            }
            count[i][0] = x;
            count[i][1] = y;
            x = 0;
            y=0;
        }
        return traverse(count,m,n,0,dp);
    }
    public int traverse(int[][] count, int m, int n, int i, int dp[][][]){
        if(i==count.length || (m==0&&n==0))
            return 0;
        if(dp[i][m][n]!=-1)
            return dp[i][m][n];
        if(count[i][0]<=m && count[i][1]<=n){
           dp[i][m][n]=  Math.max(1+traverse(count,m-count[i][0],n-count[i][1],i+1,dp),traverse(count,m,n,i+1,dp));
            return dp[i][m][n];
        }
        else{
            dp[i][m][n]= traverse(count,m,n,i+1,dp);
            return dp[i][m][n];
        }
        
    }
}