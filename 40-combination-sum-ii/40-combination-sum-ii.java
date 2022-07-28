class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        return find(nums,0, target, new ArrayList<List<Integer>>(), new ArrayList<Integer>());
    }
    public List<List<Integer>> find(int[] nums, int index, int target, List<List<Integer>> ans, List<Integer> list){
        
        if(target==0){
            ans.add(new ArrayList<Integer>(list));
            return ans;
        }
        int flag=0;
        for(int i=index;i<nums.length;i++){
           if(i>0&&nums[i]==nums[i-1]){
               if(flag!=0){
               continue;
               }
               
           }
            flag++;
            if(target-nums[i]>=0){
                list.add(nums[i]);
                find(nums,i+1,target-nums[i],ans,list);
                list.remove(list.size()-1);
            }
        }
        return ans;
    }
}