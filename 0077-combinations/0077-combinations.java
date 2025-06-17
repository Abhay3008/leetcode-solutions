class Solution {
    public List<List<Integer>> combine(int n, int k) {
        return findcombination(n,k,1,new ArrayList<Integer>());
    }
    public List<List<Integer>> findcombination(int n, int k, int ind, List<Integer> curr){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return res;
        }
        
        for(int i=ind;i<=n;i++){
            curr.add(i);
            res.addAll(findcombination(n,k,i+1,curr));
            curr.remove(curr.size()-1);
        }
        return res;
    }
}