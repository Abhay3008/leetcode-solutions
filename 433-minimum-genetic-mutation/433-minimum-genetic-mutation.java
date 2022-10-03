class Solution {
    public int minMutation(String start, String end, String[] bank) {
        List<String> strs = new ArrayList<String>();
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<Integer>());
        strs.add(start);
       
        for(int i = 0;i<bank.length;i++){
            list.add(new ArrayList<Integer>());
            strs.add(bank[i]);
        }
        int[] vis = new int[strs.size()];
        
        for(int x = 0;x<strs.size();x++){
            for(int i = x+1;i<strs.size();i++){
                if(check(strs.get(x),strs.get(i))){
                    list.get(x).add(i);
                     list.get(i).add(x);
                }
            }
        }
        // for(int i = 0;i<strs.size();i++){
        //     // System.out.println(strs.get(i));
        //     for(int x:list.get(i))
        //         System.out.print(x+" ");
        //     System.out.println();
        // }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]=1;
        int step=0;
        while(!q.isEmpty()){
            
            // System.out.print(" d");
            int n = q.size();
            for(int i = 0;i<n;i++){
                int node = q.poll();
                    // System.out.print(node+" ");
                if(comp(strs.get(node),end)==true)
                    return step;
                for(int x :list.get(node)){
                      // System.out.print(x+" ");
                    if(vis[x]==0){
                        q.add(x);
                        vis[x]=1;
                    }
                }
                
            }
            step++;
              // System.out.println(); 
        }
        
        return -1;
        
    }
    public boolean comp(String A, String B){
          // System.out.print(A+" "+B+" ");
        for(int i = 0;i<A.length();i++)
            if(A.charAt(i)!=B.charAt(i))
                return false;
        return true;
    }
    public boolean check( String A, String B){
        int count=0;
        for(int i = 0;i<A.length();i++){
           if(A.charAt(i)!=B.charAt(i))
               count++;
        }
        
        return count==1;
    }
}