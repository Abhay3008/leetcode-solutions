class Solution {
    public List<List<String>> solveNQueens(int n) {
        
       List<HashSet<pair>> list = find(new HashSet<pair>(),new ArrayList<HashSet<pair>>(), 0,0,0,n);
        List<List<String>> res = new ArrayList<List<String>>();
        
        for(int i = 0;i<list.size();i++){
            res.add(new ArrayList<String>());
            for(int j = 0;j<n;j++)
                res.get(i).add(" ");
            for(pair p : list.get(i)){
                char ch[] = new char[n];
                Arrays.fill(ch,'.');
                ch[p.j]='Q';
                String st = new String(ch);
               // System.out.println(p.i+" ");
                res.get(i).remove(p.i);
                res.get(i).add(p.i,st);
                
            }
          //  System.out.println();
            
        }
        return res;
    }
    public List<HashSet<pair>> find(HashSet<pair> set ,List<HashSet<pair>> ans, int i, int y, int p, int n){
        
        if(p==n){
            // for(pair h : set)
            //     System.out.println(h.i+" "+h.j);
            // System.out.println();
            HashSet<pair> s = new HashSet<>(set);
            ans.add(s);
            return ans;
        }
        if(i==n) return ans;
        
            for(int j = y;j<n;j++){
                int flag =0;
                for(pair h : set){
                    if(h.i==i||h.j==j||Math.abs(h.i-i)==Math.abs(h.j-j)){
                        flag = 1;
                        break;
                    }
                }
                    if(flag==1) continue;
                    // System.out.println(i+" "+j);
                    set.add(new pair(i,j));
                    find(set,ans,i+1,0,p+1,n);
                    set.remove(new pair(i,j));
                    
                    // for(pair h : set)
                    //     System.out.println(h.i+" "+h.j);
                    //         System.out.println();

                }
            
            return ans;
        } 
    }


class pair{
    int i;
    int j;
    pair(int i, int j){
        this.i = i;
        this.j = j;
    }
    public boolean equals(Object o) {
        if (o instanceof pair) {
            pair p = (pair)o;
            return p.i == i && p.j == j;
        }
        return false;
    }
    public int hashCode() {
        return new Integer(i).hashCode() * 31 + new Integer(j).hashCode();
    }
}