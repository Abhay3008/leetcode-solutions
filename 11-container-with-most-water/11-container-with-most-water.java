class Solution {
    public int maxArea(int[] nums) {
        int start = 0,end = nums.length-1,vol=0,maxvol=0;
        while(start!=end){
            vol = Math.min(nums[start],nums[end]) * (end-start);
            maxvol=Math.max(maxvol,vol);
            if(nums[start]>=nums[end])
                end--;
            else
                start++;
            
        }
        return maxvol;
    }
}