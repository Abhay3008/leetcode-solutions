class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x =x;
        this.y = y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<Pair>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    Pair p = new Pair(i,j);
                    q.add(p);
                }
            }
        }
        int count=0;
        int dir[][]= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        //  System.out.println(q.size());
        boolean flag=false;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair p = q.poll();
                // System.out.println(p.x+" "+p.y);
                for(int a=0;a<dir.length;a++){
                    int x = p.x+dir[a][0];
                    int y = p.y+dir[a][1];
                    if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]==1){
                        // System.out.println(x+" "+y);
                        grid[x][y]=2;
                        Pair temp = new Pair(x,y);
                        q.add(temp);
                    }
                }
            }
            if(flag) count++;
            flag=true;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return count;
    }
}