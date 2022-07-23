class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        int visited[][] = new int[heights.length][heights[0].length];
        PriorityQueue<point> pq = new PriorityQueue<point>((a,b) -> a.cost - b.cost);
        pq.add(new point(0,0,0));
        while(!pq.isEmpty()){
            point p = pq.poll();
            visited[p.i][p.j] = 1;
            if(p.i==heights.length-1 && p.j==heights[0].length-1)
                return p.cost;
            if(p.j+1<heights[0].length && visited[p.i][p.j+1]!=1)
                pq.add(new point(p.i,p.j+1,Math.max(p.cost,Math.abs(heights[p.i][p.j]-heights[p.i][p.j+1]))));
            if(p.j-1>=0 && visited[p.i][p.j-1]!=1)
                pq.add(new point(p.i,p.j-1,Math.max(p.cost,Math.abs(heights[p.i][p.j]-heights[p.i][p.j-1]))));
            if(p.i+1<heights.length && visited[p.i+1][p.j]!=1)
                pq.add(new point(p.i+1,p.j,Math.max(p.cost,Math.abs(heights[p.i][p.j]-heights[p.i+1][p.j]))));
            if(p.i-1>=0 && visited[p.i-1][p.j]!=1)
                pq.add(new point(p.i-1,p.j,Math.max(p.cost,Math.abs(heights[p.i][p.j]-heights[p.i-1][p.j]))));
        }
        return 0;
    }
}
class point{
    int i;
    int j;
    int cost;
    point(int i,int j,int cost){
        this.i = i;
        this.j = j;
        this.cost = cost;
    }
}