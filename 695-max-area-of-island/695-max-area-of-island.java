class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        int vis[][] = new int[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(vis[i][j]!=1 && grid[i][j]==1){
                    int x = dfs(vis,grid,i,j);
                    area = Math.max(area,x);
                }
            }
        }
        return area;
    }
    public int dfs(int[][] vis, int[][] grid, int i, int j){
        if(i<0||i==grid.length||j<0||j==grid[0].length||grid[i][j]==0||vis[i][j]==1)
            return 0;
        vis[i][j]=1;
        int area = 1;
        area +=dfs(vis,grid,i+1,j);
        area +=dfs(vis,grid,i-1,j);
        area +=dfs(vis,grid,i,j+1);
        area +=dfs(vis,grid,i,j-1);
        return area;
    }
}