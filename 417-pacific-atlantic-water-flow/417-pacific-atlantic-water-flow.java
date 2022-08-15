class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<pair> pac = new ArrayList<pair>();
        int[][] vis = new int[heights.length][heights[0].length];
        for(int i = 0,j=0;j<heights[0].length;j++){
            if(vis[i][j]!=1){
                bfs(heights,i,j,pac,vis);
            }
        }
        for(int i = 1,j=0;i<heights.length;i++){
            if(vis[i][j]!=1){
                bfs(heights,i,j,pac,vis);
            }
        }
        List<pair> atl = new ArrayList<pair>();
        for(int i = 0;i<vis.length;i++)
            for(int j = 0;j<vis[0].length;j++)
                vis[i][j]=0;
        
        for(int i = heights.length-1,j=0;j<heights[0].length;j++){
            if(vis[i][j]!=1){
                bfs(heights,i,j,atl,vis);
            }
        }
        for(int i = 0,j=heights[0].length-1;i<heights.length-1;i++){
            if(vis[i][j]!=1){
                bfs(heights,i,j,atl,vis);
            }
        }
        for(int i = 0;i<vis.length;i++)
            for(int j = 0;j<vis[0].length;j++)
                vis[i][j]=0;
        
        for(pair p : pac){
            vis[p.i][p.j]++;
        }
        for(pair p : atl){
            vis[p.i][p.j]++;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0;i<vis.length;i++)
            for(int j = 0;j<vis[0].length;j++){
                if(vis[i][j]>1){
                    res.add(new ArrayList<Integer>());
                    res.get(res.size()-1).add(i);
                    res.get(res.size()-1).add(j);
                }
            }
        
        
        return res;
    }
    public void bfs(int[][] grid, int i, int j,List<pair> list,int[][] vis){
        list.add(new pair(i,j));
        
        vis[i][j]=1;
        if(i>0 && grid[i-1][j]>=grid[i][j] && vis[i-1][j]!=1)
            bfs(grid,i-1,j,list,vis);
        if(i<grid.length-1 && grid[i+1][j]>=grid[i][j] && vis[i+1][j]!=1)
            bfs(grid,i+1,j,list,vis);
        if(j>0 && grid[i][j-1]>=grid[i][j] && vis[i][j-1]!=1)
            bfs(grid,i,j-1,list,vis);
        if(j<grid[0].length-1 && grid[i][j+1]>=grid[i][j] && vis[i][j+1]!=1)
            bfs(grid,i,j+1,list,vis);
        return;
    }
}
class pair{
    int i;
    int j;
    pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}