class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        ArrayList<ArrayList<pair>> adj = new ArrayList<ArrayList<pair>>();
        int dist[] = new int[n];
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<pair>());
            dist[i] = Integer.MIN_VALUE;
        }
        for(int i = 0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new pair(flights[i][2],flights[i][1]));
        }
        // for(int i = 0;i<adj.size();i++)
        //     for(pair j:adj.get(i))
        //         System.out.print(j.city+" ");
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> a.price-b.price);
        pq.add(new pair(0, src, k+1));
        dist[src]=0;
        while(!pq.isEmpty()){
            pair p = pq.poll();
            if(p.k < 0 || dist[p.city] > p.k)continue;
            dist[p.city]=p.k;
           // System.out.println(p.city+" "+p.price+" "+p.k);
            if(p.city==dst && p.k>=0){
                return p.price; 
            }
            for(pair i:adj.get(p.city)){
                    pq.add(new pair(p.price+i.price,i.city,p.k-1));
            }
        }

        return -1;
    }
}
class pair{
    int price;
    int city;
    int k;
    pair(int price,int city){
        this.price = price;
        this.city = city;
    }
     pair(int price,int city, int k){
        this.price = price;
        this.city = city;
        this.k = k;
    }
    
}