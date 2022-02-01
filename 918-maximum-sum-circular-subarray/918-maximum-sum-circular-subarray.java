class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_sum = kadane(nums);
        if(max_sum<0)
            return max_sum;
            int arr_sum = 0;
        for(int i = 0;i<nums.length;i++){
            arr_sum += nums[i];
            nums[i] = -nums[i];
        }
            int circu_max = arr_sum + kadane(nums);
        
        return Math.max(max_sum, circu_max);
    }
    public int kadane(int[] nums){
        int max_ending = nums[0];
        int curr_max = nums[0];
        for(int i = 1;i<nums.length;i++){
            max_ending = Math.max(nums[i],max_ending+nums[i]);
            curr_max = Math.max(max_ending, curr_max);
        }
        return curr_max;
    }
}