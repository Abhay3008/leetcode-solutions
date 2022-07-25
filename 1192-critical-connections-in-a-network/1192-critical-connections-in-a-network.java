class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] time=new int[n];
        int[] low=new int[n];
        int[] vis = new int[n];
        List<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        for(int i=0;i<connections.size();i++){
            adj.get(connections.get(i).get(0)).add(connections.get(i).get(1));
            adj.get(connections.get(i).get(1)).add(connections.get(i).get(0));
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
    find(time, low, -1, 0, 1, vis, adj, ans);
        return ans;
    }
    private void find(int[] time, int[] low, int par, int curr, int cost,int[] vis, List<ArrayList<Integer>> adj,List<List<Integer>> ans ){
        vis[curr]=1;
        low[curr] = cost;
        time[curr] = low[curr];
        cost++;
        
        for(int i : adj.get(curr)){
            
            if(i==par) continue;
            if(vis[i]!=1){
                find(time, low, curr, i, cost, vis, adj, ans);
                low[curr] = Math.min(low[i], low[curr]);
                if(time[curr]<low[i]){
                    ans.add(new ArrayList<>());
                    ans.get(ans.size()-1).add(i);
                    ans.get(ans.size()-1).add(curr);
                }
                
            }
            else
                low[curr] = Math.min(low[curr], time[i]);
        }
            
        
    }
}