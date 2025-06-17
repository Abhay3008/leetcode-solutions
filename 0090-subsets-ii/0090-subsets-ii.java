class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        return findsum(nums, 0,new ArrayList<>());
    }
    public List<List<Integer>> findsum(int[] nums, int ind, List<Integer> curr){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(ind==nums.length) {
            // System.out.println(curr.toString());
            list.add(new ArrayList<>(curr));
            return list;
        }
        if(ind>nums.length) return list;
        list.add(curr);

        int prev = -11;
        for(int i=ind;i<nums.length;i++){
            if(prev!=nums[i]){
                System.out.println(nums[i]);
                curr.add(nums[i]);
                list.addAll(findsum(nums, i+1,new ArrayList<>(curr)));
                curr.remove(curr.size()-1);
                prev=nums[i];
            }
        }
        return list;
    }
}