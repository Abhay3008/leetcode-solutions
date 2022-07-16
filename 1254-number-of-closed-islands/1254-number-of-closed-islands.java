class Solution {
    public int closedIsland(int[][] grid) {
        int vis[][] = new int[grid.length][grid[0].length];
        int count=0;
        for(int i = 1;i<grid.length;i++){
            for(int j = 1;j<grid[0].length;j++){
                if(vis[i][j]!=1 && grid[i][j]==0){
                    if(dfs(vis,grid,i,j)){
                        count++;
                       // System.out.print(i+""+j+" ");
                    }
                }
            }
        }
        return count;
    }
    public boolean dfs(int[][] vis, int[][] grid, int i, int j){
        vis[i][j]=1;
        if(i==0||i==grid.length-1||j==0||j==grid[0].length-1) 
            return false;
        int flag = 0;
        if(grid[i+1][j]==0&&vis[i+1][j]!=1)
            if(!dfs(vis,grid,i+1,j)){
                flag = 1;
                
            }
        if(grid[i-1][j]==0&&vis[i-1][j]!=1)
            if(!dfs(vis,grid,i-1,j)){
                flag = 1;
                
            }
        if(grid[i][j+1]==0&&vis[i][j+1]!=1)
            if(!dfs(vis,grid,i,j+1)){
                flag = 1;
                
            }
        if(grid[i][j-1]==0&&vis[i][j-1]!=1)
            if(!dfs(vis,grid,i,j-1)){
                flag = 1;
                
            }
        if(flag == 1){
            vis[i+1][j]=1;
            vis[i-1][j]=1;
            vis[i][j+1]=1;
            vis[i][j-1]=1;
            return false;
        }
        return true;
    }
}