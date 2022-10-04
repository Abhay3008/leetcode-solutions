class Solution {
    public int openLock(String[] deadends, String target) {
        if (target.equals("0000"))
            return 0;
        Set<String> vis = new HashSet<>(Arrays.asList(deadends));
        
        if (vis.contains("0000"))
            return -1;
        
        Queue<String> q = new LinkedList<String>();
        q.add("0000");
        vis.add("0000");
       int step=0;
        while(!q.isEmpty()){
            int n = q.size();
            
            for(int x = 0;x<n;x++){
                String curr = q.poll();
                for(int i = 0;i<4;i++){
                    char c = curr.charAt(i);

                    String up = curr.substring(0,i) + (c=='9'?0:c-'0'+1)+curr.substring(i+1);
                    String down = curr.substring(0,i) + (c=='0'?9:c-'0'-1)+curr.substring(i+1);
                    
                    if(up.equals(target)||down.equals(target))
                        return step+1;
                    if(vis.add(up)){
                       q.add(up); 
                    }
                    if(vis.add(down)){
                       q.add(down); 
                    }
                }
            }
            step++;
            
        }
       
        
        
        return -1;
    }
   
}