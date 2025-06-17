class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return findpermute(nums,0,new ArrayList<Integer>());
    }
    public List<List<Integer>> findpermute(int[] nums, int ind, List<Integer> curr){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
       
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
        }
        if(ind>=nums.length) return res;
        for(int i=0;i<=curr.size();i++){
            curr.add(i,nums[ind]);
            System.out.println(curr.toString());
            res.addAll(findpermute(nums,ind+1,new ArrayList<>(curr)));
            curr.remove(i);
        }
        return res;
    }
}