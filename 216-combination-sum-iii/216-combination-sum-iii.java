class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(ans, new ArrayList<Integer>(), 1,k,n,0);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> ls, int ind, int k, int n,int sum){
        
        if(k==0){
            if(sum==n){
                ans.add(new ArrayList<Integer>(ls));
                return;
            }
            return;     
        }
        if(sum>=n){ 
            return;
        }
        int x = sum;
        for(int i = ind;i<10;i++){
            x+=i;
            if(x>n)
                 break;
            ls.add(i);
            helper(ans,ls,i+1,k-1,n,x);
            ls.remove(ls.size()-1);
            x=sum;
        }
    }
}