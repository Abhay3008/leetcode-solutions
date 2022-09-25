class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<Integer>();
        int[] vis = new int[graph.length];
        for(int i = 0;i<graph.length;i++){
            if(dfs(graph,vis,i))
                res.add(i);
        }
        return res;
    }
    public boolean dfs(int[][] graph, int[] vis, int curr){
        if(vis[curr]==1) return false;
       // if(vis[curr]==2) return true;
        vis[curr]=1;
        for(int i = 0;i<graph[curr].length;i++){
            int next = graph[curr][i];
            if(vis[next]==2) continue;
            if(vis[next]==1 || !dfs(graph,vis,next))
                return false;
        }
        vis[curr]=2;
        return true;
    }
}