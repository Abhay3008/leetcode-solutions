class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int far = 2000+2*b,count=0;
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair(0,0));
        Set<Pair<Integer, Integer>> vis = new HashSet<>(q);
        for(int forb:forbidden){
            vis.add(new Pair(0,forb));
            vis.add(new Pair(1,forb));
            far = Math.max(far,forb+2*b);
        }
        
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0;i<n;i++){
                Pair<Integer,Integer> p = q.poll();
                int dir = p.getKey();
                int pos = p.getValue();
                if(pos==x) return count;
                
                Pair<Integer,Integer> forw = new Pair(1,pos+a),backw = new Pair(0,pos-b);
                if(pos+a<=far && vis.add(forw)){
                    q.add(forw);
                }
                if(dir==1 && pos-b>=0 && vis.add(backw)){
                    q.add(backw);
                }
            }
            count++;
        }
        return -1;
        
    }
}