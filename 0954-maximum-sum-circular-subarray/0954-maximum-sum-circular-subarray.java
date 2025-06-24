class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0,max = Integer.MIN_VALUE, minsum=0,min=Integer.MAX_VALUE,total=0;
        for(int i=0;i<nums.length;i++){
            sum= Math.max(sum+nums[i],nums[i]);
            minsum= Math.min(minsum+nums[i],nums[i]);
            total+=nums[i];
            max = Math.max(max,sum);
            min = Math.min(min,minsum);
        }
        if(max>0){
            return Math.max(max,total-min);
        }
        return max;
    }

}