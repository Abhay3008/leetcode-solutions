class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return subsetfind(nums,0,new ArrayList<Integer>());
    }
    public List<List<Integer>> subsetfind(int[] nums, int ind, List<Integer> list){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(ind>=nums.length){
            res.add(new ArrayList<>(list));
            return res;
        } 
        res.addAll(subsetfind(nums,ind+1, new ArrayList<>(list)));
        list.add(nums[ind]);
        res.addAll(subsetfind(nums,ind+1, new ArrayList<>(list)));
        return res;
    }
}