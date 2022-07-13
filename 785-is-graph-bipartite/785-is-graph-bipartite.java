class Solution {
    public boolean isBipartite(int[][] graph) {
        //bfs
        Queue<Integer> q = new LinkedList<>();
        //to give set
        int set[] = new int[graph.length];
        for(int i = 0;i<graph.length;i++){
            //traversal
            if(set[i]==0){
            q.add(i);
            set[i] = 1;
            while(!q.isEmpty()){
                int n = q.poll();
                for(int j: graph[n]){
                    //mark adjacent with diff set.
                    if(set[j]==0){
                        if(set[n]==1)
                            set[j]=2;
                        else
                            set[j]=1;
                        q.add(j);
                    }
                    else{
                        if(set[j]==set[n]){
                            return false;
                    }}
                }
            }
        }
        }
       
        return true;
    }
}