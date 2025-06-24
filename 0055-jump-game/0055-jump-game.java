class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i==nums.length-1) return true;
            if(nums[i]==0)return false;
            int j=i+1,max=i,count=0;
            if(i+nums[i] <nums.length && nums[i+nums[i]]==0) count++;
            while(j<=i+nums[i] && j<nums.length){
                if(j==nums.length-1 || j+nums[j]>=nums.length-1) return true;
                if(nums[j+nums[j]]==0) count++;
                if(j+nums[j]>max+nums[max]){
                    max = j;
                }
                j++;
            }
            
            if(max+nums[max]>=nums.length-1)return true;
            if(count==nums[i]+1){ 
                System.out.println(i);return false;
            }
            i=max;
        //     if(nums[i+nums[i]]==0 && count==){
        //         System.out.println(i);
        //         return false;
        //     }
        }
        return true;
    }
}