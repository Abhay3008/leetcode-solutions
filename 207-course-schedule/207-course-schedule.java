class Solution {
    public boolean canFinish(int len, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<len;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<prerequisites.length;i++){
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q = new LinkedList<>();
        int vis[] = new int[len];
        for(int i =0;i<len;i++){
            if(check(i,vis,list)) return false;
        }
        return true;
    }
    public boolean check(int curr, int[] vis, ArrayList<ArrayList<Integer>> list){
        if(vis[curr]==1) return true;
        vis[curr]=1;
        for(int node:list.get(curr)){
            if(vis[node]!=2)
            if(check(node,vis,list)) return true;
        }
        vis[curr]=2;
        return false;
    }
}