class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        // System.out.print(-4&1);
        int sum =0;
        for(int i = 0;i<nums.length;i++){
            sum+=((nums[i]&1)==1)?0:nums[i];
        }
        int res[] = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            int ind = queries[i][1];
            int val = queries[i][0];
            if((nums[ind]&1)==0){
                sum-=nums[ind];
            }
            nums[ind]+=val;
           // System.out.print(nums[ind]+" ");
            if((nums[ind]&1)==0)
                sum+=nums[ind];
            res[i]=sum;
        }
        return res;
    }
}