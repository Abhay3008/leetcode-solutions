class Solution {
    public int[] plusOne(int[] nums) {
        nums[nums.length-1] +=1;
        int carry = nums[nums.length-1]==10?1:0;
    nums[nums.length-1] = nums[nums.length-1]==10?0:nums[nums.length-1];
        int i = nums.length-2;
        while(i>=0 && carry>0){
            nums[i] = nums[i]+1;
            carry = nums[i]==10?1:0;
            nums[i] = nums[i]==10?0:nums[i];
            i--;
        }
        if(carry==1){
            int[] ans = new int[nums.length+1];
            ans[0]=1;
            for( i = 0;i<nums.length;i++)
                ans[i+1] = nums[i];
            return ans;
        }
        return nums;
        
    }
}