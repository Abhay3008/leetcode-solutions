class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp= new int[target+1];
        Arrays.fill(dp,-1);
        return traverse(nums,0,target,dp); 
    }
    
    public int traverse(int[] nums,int t, int target,int[] dp){
        if(t>target)
            return 0;
        if(t==target)
            return 1;
        if(dp[t]!=-1)
            return dp[t];
        int c = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<=target)
            c +=traverse(nums,t+nums[i],target,dp);
        }
        dp[t]=c;
        return dp[t];
    }
}