class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int l=0;l<nums.length;l++){
            for(int r = l+1;r<=l+k&& r<nums.length;r++)
            if(nums[l]==nums[r])
                return true;
        }
        return false;
         }
}