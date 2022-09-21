class Solution {
    int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public int shortestBridge(int[][] grid) {
        int flag = 0;
        int[][] vis=new int[grid.length][grid.length];
        Queue<pair> q = new LinkedList<>();
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    dfs(grid,vis,i,j,q);
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                break;
        }
        return bfs(grid,q,vis);
    }
    public void dfs(int[][] grid, int[][] vis, int i, int j, Queue<pair> q){ 
        q.add(new pair(i,j));
        vis[i][j]=1;
        for(int[] d:dir){
            int r = i+d[0];
            int c = j+d[1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && vis[r][c]==0 && grid[r][c]!=0)
                dfs(grid,vis,r,c,q);
        }
        return;
    }
    public int bfs(int[][] grid,Queue<pair> q, int[][] vis){
                  int sum = 0;
        
        while(!q.isEmpty()){
           
            int n = q.size();
            for(int x = 0;x<n;x++){
                pair p = q.poll();
                int i = p.i;
                int j = p.j;
                 for(int[] d: dir){
                            int r = i+d[0];
                            int c = j+d[1];
                            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && vis[r][c]==0){
                                if(grid[r][c]==1){
                                    return sum;
                                }
                                vis[r][c]=1;
                                q.add(new pair(r,c));
                                //System.out.print("csd ");
                            }
                        }
            }
            sum++;
        }
            
        return Integer.MAX_VALUE;
    }
}
class pair{
    int i;
    int j;
    
    pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}