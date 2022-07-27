class Solution {
    int flag = 0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int[][] visited = new int[grid2.length][grid2[0].length];
        
        int count = 0;
        for(int i = 0;i<grid2.length;i++){
            for(int j = 0;j<grid2[0].length;j++){
                if(visited[i][j]!=1 && grid2[i][j]==1){
                    dfs(visited,grid1, grid2, i, j);
                    if(flag==0){
                        count++;
                      //  System.out.println(i+" "+j);
                    }
                    flag = 0;
                }
            }
        }
        return count;
    }
    public boolean dfs(int[][] visited, int[][] grid1, int[][] grid2, int i, int j){
        
        if(i==-1 || i==grid2.length || j==-1 || j==grid2[0].length || visited[i][j]==1 || grid2[i][j]==0)
            return true;
        visited[i][j]=1;
        if(grid1[i][j]!=grid2[i][j]) flag = 1;
        dfs(visited,grid1,grid2,i+1,j);
        dfs(visited,grid1,grid2,i-1,j);
        dfs(visited,grid1,grid2,i,j+1);
        dfs(visited,grid1,grid2,i,j-1);
        return true;
    }
}