class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        find(res,candidates,new ArrayList<Integer>(),0,target);
        return res;
    }
    public void find(List<List<Integer>> res,int[] up,List<Integer> p,int ind, int target){
        if(target<0)
            return;
        if(target==0){
            res.add(new ArrayList<>(p));
            return;
        }
        for(int i = ind;i<up.length;i++){
            p.add(up[i]);
            find(res,up,p,i,target-up[i]);
            p.remove(p.size()-1);
        }
        return;
        
        
    }
}