class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        Queue<pair> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0;i<n;i++)
            list.add(new ArrayList<Integer>());
        for(int i = 0;i<manager.length;i++){
            if(manager[i]==-1) continue;
            list.get(manager[i]).add(i);
        }
        q.add(new pair(headID,0));
        int time = 0;
        while(!q.isEmpty()){
            int len = q.size();
          //  int maxT = 0;
            for(int i = 0;i<len;i++){
                pair node = q.poll();
                if(list.get(node.node).size()==0)
                    time = Math.max(time,node.time);
                for(int j :list.get(node.node)){
                    q.add(new pair(j,node.time + informTime[node.node]));
                }
            }
            //time+=maxT;
        }
        return time;
    }
}
class pair{
    int node;
    int time;
    pair(int node, int time){
        this.node = node;
        this.time = time;
    }
}