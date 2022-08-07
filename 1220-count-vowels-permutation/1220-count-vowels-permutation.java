class Solution {
    int mod = (int)1e9 + 7;
    public int countVowelPermutation(int n) {
        char ch[] = new char[]{'a','e','i','o','u'};
        int[][] dp = new int[6][n+1];
        for(int i = 0;i<dp.length;i++)
            for(int j = 0;j<n+1;j++)
                dp[i][j]=-1;
        int count = 0;
        for(int i = 0;i<5;i++)
            count=(count+traverse(ch[i],n-1,dp))%mod;
        return count%mod;
    }
    public int traverse(char s,int n,int[][] dp){
        if(n==0)
            return 1;
        
        int k =0;
        if(s=='a')
         k = 1;
        if(s=='e')
         k = 2;
        if(s=='i')
         k = 3;
        if(s=='o')
         k = 4;
        if(s=='u')
         k = 5;
        if(dp[k][n]!=-1)
            return dp[k][n];
        int count = 0;
        if(s=='a'){
            count = (count+traverse('e',n-1,dp))%mod;
            count = (count+traverse('u',n-1,dp))%mod;
            count =(count+traverse('i',n-1,dp))%mod;
        }
        else if(s=='e'){
           count = (count+traverse('a',n-1,dp))%mod;
            count = (count+traverse('i',n-1,dp))%mod;
        }
        else if(s=='i'){
            
            count =(count+ traverse('o',n-1,dp))%mod;
            count = (count+traverse('e',n-1,dp))%mod;
        }
        else if(s=='o'){
            count = traverse('i',n-1,dp);
        }
        else if(s=='u'){
            count =(count+ traverse('o',n-1,dp))%mod;
            count = (count+traverse('i',n-1,dp))%mod;
        }
        dp[k][n] = count;
        return dp[k][n] %mod;
        
    }
}