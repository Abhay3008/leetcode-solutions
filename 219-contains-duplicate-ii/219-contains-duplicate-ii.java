class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> ls = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(ls.size()>k)
                ls.remove(nums[i-k-1]);
            if(ls.add(nums[i])==false)
                    return true;
               }
               return false;

               
               
               }
               }