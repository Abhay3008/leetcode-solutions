class Solution {
    public boolean canReach(int[] arr, int start) {
        int vis[] = new int[arr.length];
        return dfs(arr,start,vis);
    }
    public boolean dfs(int[] arr, int start,int[] vis){
        if(arr[start]==0)
            return true;
        if(vis[start]==1) return false;
        vis[start]=1;
        if(start+arr[start]<arr.length)
            if(dfs(arr,start+arr[start],vis)==true)
                return true;
        if(start-arr[start]>=0)
            if(dfs(arr,start-arr[start],vis)==true)
                return true;
        return false;
    }
}