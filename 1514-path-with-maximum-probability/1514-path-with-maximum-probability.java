class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<ArrayList<pair>>();
        double[] distance = new double[n];
        
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<pair>());
            
        }
        for(int i = 0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new pair(succProb[i],edges[i][1]));
            adj.get(edges[i][1]).add(new pair(succProb[i],edges[i][0]));

        }
        // for(int i = 0;i<adj.size();i++)
        //     for(pair j:adj.get(i))
        //         System.out.print(j.node);
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> Double.compare(b.dist, a.dist));
        pq.add(new pair(1.0,start));
        distance[start]=1.0;
        while(!pq.isEmpty()){
            pair p = pq.poll();
            for(pair i :adj.get(p.node)){
                if((p.dist * i.dist)>distance[i.node]){
                    distance[i.node] = p.dist * i.dist;
                    //System.out.print(distance[i.node]+" ");
                    pq.add(new pair(distance[i.node],i.node));
                }
                }
        }
        // for(double i : distance)
        //     System.out.print(i+" ");
        return distance[end];
        
    }
}
class pair{
    double dist;
    int node;
    pair(double dist, int node){
        this.dist = dist;
        this.node = node;
    }
}