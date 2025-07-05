class Solution {
    public int maxArea(int[] nums) {
        int l=0,r=nums.length-1;
        int area = calcArea(nums,l,r);
        while(l<r){
            area = Math.max(area,calcArea(nums,l,r));
            if(nums[l]<nums[r]){
                l++;
            }
            else{
                r--;
            }
            
        }
        return area;
    }
    public int calcArea(int[] nums, int i, int j){
        return (Math.min(nums[i],nums[j])*(j-i));
    }
}