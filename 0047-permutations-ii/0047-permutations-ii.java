class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        return findpermute(nums,used,new ArrayList<Integer>());
    }
    public List<List<Integer>> findpermute(int[] nums, int[] used, List<Integer> curr){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
       
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==1) continue;
            if(i>0 && nums[i-1] == nums[i] && used[i-1]==0) continue;
            used[i]=1;
            curr.add(nums[i]);
            // System.out.println(curr.toString());
            res.addAll(findpermute(nums,used,new ArrayList<>(curr)));
            used[i]=0;
            curr.remove(curr.size()-1);
        }

        return res;
    }
}