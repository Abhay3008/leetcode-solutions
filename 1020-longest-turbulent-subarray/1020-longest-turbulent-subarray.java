class Solution {
    public int maxTurbulenceSize(int[] nums) {
        if(nums.length==1) return 1;
        int size=0,max=0,i=0;
        while(i<nums.length-1){
            size++;
            max=Math.max(size,max);
            if(i%2==0&&nums[i]<=nums[i+1]){
                size=0;
            }
            else if(i%2==1&&nums[i]>=nums[i+1]){
                size=0;
            }
            i++;
        }
        if(i%2==0&&nums[i]>nums[i-1]){
            size++;
        }
        else if(i%2==1&&nums[i]<nums[i-1]){
            size++;
        }
        max=Math.max(size,max);
        i=0;
        size=0;
        while(i<nums.length-1){
            size++;
            max=Math.max(size,max);
            if(i%2==0&&nums[i]>=nums[i+1]){
                size=0;
            }
            else if(i%2==1&&nums[i]<=nums[i+1]){
                size=0;
            }
            i++;
        }
        if(i%2==0&&nums[i]<nums[i-1]){
            size++;
        }
        else if(i%2==1&&nums[i]>nums[i-1]){
            size++;
        }
        max=Math.max(size,max);
        return max;
    }
}