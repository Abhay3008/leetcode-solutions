class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] vis = new int[rooms.size()];
        dfs(rooms,vis,0);
        for(int i = 0;i<vis.length;i++)
            if(vis[i]==0)
                return false;
        return true;
    }
    public void dfs(List<List<Integer>> rooms, int[] vis, int x){
        if(vis[x]==1) return;
        
        vis[x]=1;
        for(int i:rooms.get(x)){
            dfs(rooms,vis,i);
        }
    }
}