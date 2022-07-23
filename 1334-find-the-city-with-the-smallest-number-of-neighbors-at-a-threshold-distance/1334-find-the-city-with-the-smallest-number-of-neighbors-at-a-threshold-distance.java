class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        ArrayList<ArrayList<pair>> list = new ArrayList<ArrayList<pair>>();
        for(int i = 0;i<n;i++)
            list.add(new ArrayList<pair>());
        for(int i = 0;i<edges.length;i++){
            for(int j = 0;j<edges[i].length;j++){
                list.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
                list.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));
            }
        }
        pair ans = new pair(0,Integer.MAX_VALUE);
        for(int i = 0;i<n;i++){
            int[] distance = new int[n];
            for(int j = 0;j<distance.length;j++)
                distance[j] = Integer.MAX_VALUE;
            int count = 0;
            PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> a.dist - b.dist);
            pq.add(new pair(i,0));
            distance[i] = 0;
            while(!pq.isEmpty()){
                pair p = pq.poll();
                for(pair j : list.get(p.city)){
                    
                    if(p.dist+j.dist<distance[j.city] && p.dist+j.dist<=distanceThreshold){
                       // System.out.print(j.city+" ");
                        if(distance[j.city]==Integer.MAX_VALUE)
                            count++;
                        distance[j.city] = p.dist+j.dist;
                        pq.add(new pair(j.city,distance[j.city]));
                    }
                }
                
            }
            //System.out.println(count);
            if(count<=ans.dist){
                ans.dist=count;
                ans.city = i;
            }
            
        }
        return ans.city;
    }
}
class pair{
    int city;
    int dist;
    pair(int city, int dist){
        this.city = city;
        this.dist = dist;
    }
}