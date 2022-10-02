class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(z>x+y) return false;
        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        set.add(0);
        while(!q.isEmpty()){
            int n = q.poll();
            if(n+x<=(x+y) && set.add(n+x)){
                q.add(n+x);
            }
            if(n+y<=(x+y) && set.add(n+y)){
                q.add(n+y);
            }
            if(n-x>=0 && set.add(n-x)){
                q.add(n-x);
            }
            if(n-y>=0 && set.add(n-y)){
                q.add(n-y);
            }
            if(set.contains(z))
                return true;
        }
        return false;
    }
}