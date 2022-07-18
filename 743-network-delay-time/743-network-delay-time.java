class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        ArrayList<ArrayList<pair>> adj = new ArrayList<ArrayList<pair>>();
        int[] dist = new int[n+1];
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<pair>());
            dist[i] = Integer.MAX_VALUE;
        }
        
        for(int i = 0;i<times.length;i++){
            adj.get(times[i][0]).add(new pair(times[i][2],times[i][1]));
        }
        // for(int i = 0;i<adj.size();i++)
        //     for(pair j:adj.get(i))
        //         System.out.print(j.node+" ");
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> a.wt-b.wt);
        pq.add(new pair(0,k));
        dist[k]=0;
        while(!pq.isEmpty()){
            pair p = pq.poll();
            
            for(pair i:adj.get(p.node)){
                if((p.wt+i.wt)<dist[i.node]){
                    dist[i.node] = p.wt+i.wt;
                    pq.add(new pair(dist[i.node],i.node));
                }
            }
        }
        int ans=0;
        for(int i = 1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE){
              //  System.out.print(i+" ");
                return -1;
            }
           // System.out.print(dist[i]+" ");
            ans = Math.max(ans,dist[i]);
            
        }
         return ans;
    }
}
class pair{
    int wt;
    int node;
    pair(int wt, int node){
        this.wt = wt;
        this.node = node;
    }
}