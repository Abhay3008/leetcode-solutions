class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return findsum(candidates, 0, target,0,new ArrayList<>());
    }
    public List<List<Integer>> findsum(int[] nums, int ind, int target, int sum, List<Integer> curr){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(sum>target) return list;
        if(sum==target) {
            // System.out.println(curr.toString());
            list.add(new ArrayList<>(curr));
            return list;
        }
        int prev = -1;
        for(int i=ind;i<nums.length;i++){
            if(prev!=nums[i]){
                // System.out.println(nums[i]);
                curr.add(nums[i]);
                list.addAll(findsum(nums, i+1, target, sum+nums[i],new ArrayList<>(curr)));
                curr.remove(curr.size()-1);
                prev=nums[i];
            }
        }
        return list;
    }
}