class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0, max = 0;
        for(int i = 0, j = 0;j<nums.length;j++){
            if(set.contains(nums[j])){
                while(nums[i]!=nums[j]){
                    ans-=nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                i++;
                
            }
            else
            {
                ans+=nums[j];
                set.add(nums[j]);
            }
            max = Math.max(max, ans);
            System.out.print(max+" ");
        }
        
        return max;
        
    }
}