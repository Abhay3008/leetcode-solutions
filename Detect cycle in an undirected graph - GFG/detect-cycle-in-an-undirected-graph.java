// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends



class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int vis[] = new int[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]!=1){
                if(check(vis,adj,new pair(-1,i))) return true;
            }
        }

        return false;
    }
    public boolean check(int[] vis, ArrayList<ArrayList<Integer>> adj, pair node){
        if(vis[node.second] == 1) return true;
        vis[node.second] = 1;
        
        for(int i:adj.get(node.second)){
            if(vis[i]!=1){
                if(check(vis,adj,new pair(node.second,i))) return true;
            }
            else if(i!=node.first) return true;
        }
        return false;
    }   
}
class pair{
    int first;
    int second;
     pair(int first, int second){
         this.first = first;
         this.second = second;
    }
}