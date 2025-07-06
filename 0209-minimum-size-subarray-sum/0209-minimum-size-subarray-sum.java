class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l=0,size=nums.length+1,sum=0,r=-1;
        while(r<nums.length-1){
            if(sum<target){
                sum+=nums[r+1];
                r++;
            }
            else{
                while(sum-nums[l]>=target){
                    sum-=nums[l];
                    l++;
                }

                size=Math.min(size,r-l+1);
                sum+=nums[r+1];
                r++;
               
            }
            //  System.out.println(sum+" "+l+" "+r);
            
        }
        // System.out.println(sum+" "+l+" "+r);
        if(sum>=target){
            while((sum-nums[l])>=target){
                sum-=nums[l];
                l++;
            }
            size=Math.min(size,r-l+1);
        }
        return size==nums.length+1?0:size;

    }
}