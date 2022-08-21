class Solution {
    public int[][] updateMatrix(int[][] grid) {
        for(int i = 0;i<grid.length;i++)
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0) continue;
                grid[i][j]=(int)10e4;
                if(i>0)
                    grid[i][j] = Math.min(grid[i][j],grid[i-1][j]+1);
                if(j>0)
                    grid[i][j] = Math.min(grid[i][j],grid[i][j-1]+1);
            }
        
        for(int i = grid.length-1;i>-1;i--){
            for(int j = grid[0].length-1;j>-1;j--){
                if(grid[i][j]==0) continue;
                
                if(i<grid.length-1)
                     grid[i][j] = Math.min(grid[i][j],grid[i+1][j]+1);
                if(j<grid[0].length-1)
                    grid[i][j] = Math.min(grid[i][j],grid[i][j+1]+1);
            }
        }
        return grid;
    }
}