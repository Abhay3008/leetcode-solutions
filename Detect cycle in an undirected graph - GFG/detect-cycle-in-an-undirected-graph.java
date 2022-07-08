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
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        HashSet<Integer> h= new HashSet<Integer>();
        Queue <pair> q= new LinkedList <pair> ();
        for(int i=0; i<V; i++){
            if(h.contains(i)) continue;
            q.add(new pair(i, -1));
            h.add(i);
            while(!q.isEmpty()){
                pair pr = q.poll();
                for(int k : adj.get(pr.c)){
                    if(h.contains(k) && k!=pr.p) return true;
                    if(h.contains(k)) continue;
                    q.add(new pair(k, pr.c));
                    h.add(k);
                }
            }
            
        }
        return false;
    }
}
class pair{
    int c;      //curent
    int p;      //parent
    pair(int c, int p){
        this.p= p;
        this.c=c;
    }
}