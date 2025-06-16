class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return (findsum(candidates, 0, target,0,new ArrayList<>()));
    }

    public List<List<Integer>> findsum(int[] nums, int ind, int target, int sum, List<Integer> curr){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(sum>target) return list;
        if(sum==target) {
            list.add(new ArrayList<>(curr));
            return list;
        }
        for(int i=ind;i<nums.length;i++){
            curr.add(nums[i]);
            list.addAll(findsum(nums, i, target, sum+nums[i],curr));
            curr.remove(curr.size()-1);
        }
        return list;
    }
}