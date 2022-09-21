class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        int vis[][] =new int[maze.length][maze[0].length];
        vis[entrance[0]][entrance[1]]=1;
        int step = 0;
        while(!q.isEmpty()){
            
            int n = q.size();
            for(int i=0;i<n;i++){
                int pos[]=q.poll();
                int x=pos[0];
                int y=pos[1];
                for(int[] d:dir){
                    int r=x+d[0];
                    int c=y+d[1];
                    if(r>=0 && c>=0 &&r<maze.length && c<maze[0].length && vis[r][c]==0 && maze[r][c]=='.'){
                        if(r==0 || r==maze.length-1 || c==0 || c==maze[0].length-1){
                            return step+1;
                        }
                    //    System.out.print("dwe");
                        q.add(new int[]{r,c});
                        vis[r][c]=1;
                    }
                }
            }
            step++;
        }
        return -1;
        
    }
}