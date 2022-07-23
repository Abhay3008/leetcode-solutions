class Solution {
    public int minCost(int[][] grid) {
        
        int visited[][] = new int[grid.length][grid[0].length];
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> a.cost - b.cost);
        pq.add(new pair(0,0,0));
        while(!pq.isEmpty()){
            pair p = pq.poll(); 
            visited[p.i][p.j]  = 1;
            if(p.i==grid.length-1 && p.j==grid[p.i].length-1){
                return p.cost;
            }
            int temp = 0;
            temp = grid[p.i][p.j]==1?0:1;
            if(p.j+1<grid[0].length && visited[p.i][p.j+1]!=1)
                pq.add(new pair(p.i,p.j+1,p.cost+temp));
            
            temp = grid[p.i][p.j]==2?0:1;
            if((p.j-1)>=0  && visited[p.i][p.j-1]!=1)
                    pq.add(new pair(p.i,p.j-1,p.cost+temp));

            temp = grid[p.i][p.j]==3?0:1;
            if(p.i+1<grid.length && visited[p.i+1][p.j]!=1)
                    pq.add(new pair(p.i+1,p.j,p.cost+temp));

            temp = grid[p.i][p.j]==4?0:1;
            if(p.i-1>=0 && visited[p.i-1][p.j]!=1)
                    pq.add(new pair(p.i-1,p.j,p.cost+temp));
                
           // System.out.println(pq.peek().i + " " + pq.peek().j + " " + pq.peek().cost);
        }
        return 0;
    }
}
class pair{
    int i;
    int j;
    int cost;
    pair(int i,int j,int cost){
        this.i = i;
        this.j = j;
        this.cost = cost;
    }
}