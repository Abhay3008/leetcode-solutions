class Solution {
public:
    int memo(int j, vector<vector<int>>& a, int ns, vector<bool> vis, map<pair<vector<bool>, pair<int,int>>, int>& dp)
    {
        int n = a.size(), m = a[0].size();
        if(j == m)
            return 0;
        // if(dp.find({vis,{j, ns}}) != dp.end())
        //     return dp[{vis,{j, ns}}];
        int x = 0;
        vector<bool> nv;
        nv = vis;
        for(int i = 0; i < n; i++)
        {
            if(!vis[i] && a[i][j])
            {
                nv[i] = true;
                x++;
            }
        }
        if(ns)
            return dp[{vis, {j, ns}}] = min(x+memo(j+1, a, ns, nv, dp), memo(j+1, a, ns-1, vis, dp));
        else
            return dp[{vis, {j, ns}}] = x + memo(j+1, a, ns, nv, dp);
    }
    int maximumRows(vector<vector<int>>& a, int ns) {
        int n = a.size(), m = a[0].size();
        vector<bool> vis(n, false);
        map<pair<vector<bool>, pair<int,int>>, int> dp;
        return n - memo(0, a, ns, vis, dp);
        
        // vector<bool> vis(n, false);
        // vector<vector<int>> dp(a[0].size(), vector<int>(ns+1, -1));
        // return n - memo(0, a, ns, vis, dp);
    }
};