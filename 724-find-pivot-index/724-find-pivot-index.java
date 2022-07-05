class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 1;i<nums.length;i++)
            nums[i] = nums[i] + nums[i-1];
        
        if((nums[nums.length -1 ]-nums[0]) == 0)
            return 0;
        
        
        int piv=1;
        
        while(piv< (nums.length -1)){
            if((nums[piv-1]) == (nums[nums.length-1] - nums[piv]))
                return piv;
            piv++;
        }
        if(nums[nums.length - 2 ] == 0)
           return nums.length -1;
        return -1;
    }
}