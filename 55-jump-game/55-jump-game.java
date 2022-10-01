class Solution {
    public boolean canJump(int[] nums) {
        
        int ind = nums.length-1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]+i>=ind)
                ind = i;
        }
        //System.out.print(ind);
        if(ind>0)
            return false;
        return true;
    }
    
}