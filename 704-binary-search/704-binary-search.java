class Solution {
    public int search(int[] nums, int target) {
        return binary(nums, target, 0, nums.length-1);
    }
    int binary(int[] nums, int target, int start, int end){
        int mid = start + ((end - start)/2);
        if(nums[mid]==target)
            return mid;
        if(end-start < 1) return -1;
        else if(target > nums[mid])
            return binary(nums, target,mid+1, end );
        else
            return binary(nums, target,start, mid);
    }
}