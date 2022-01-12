class Solution {
    public int maxSatisfied(int[] c, int[] g, int minutes) {
        int max = 0;
        for(int i = 0;i<g.length;i++){
            if(g[i]==0)
                max+=c[i];
        }
        int l = 0, r = minutes-1, ans=0;
        for(int i = 0;i<=r;i++){
            if(g[i]==1)
                ans+=c[i];
        }
        int temp = ans;
        for(l++, r++;r<c.length;l++, r++){
            if(g[l-1]==1)
                temp-=c[l-1];
            if(g[r]==1)
                temp+=c[r];
            if(temp>ans)
                ans = temp;
            }
        return max+ans;
        
    }
}