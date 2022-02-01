class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, n = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[n]==nums[i])
                count++;
            else 
                count --;
            if(count==0){
                count = 1; n = i;
            }
        }
        count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==nums[n])
                count++;
        }
        if(count>nums.length/2)
            return nums[n];
        return -1;
    }
}