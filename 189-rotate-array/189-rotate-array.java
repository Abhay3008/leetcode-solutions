class Solution {
    public void rotate(int[] nums, int k) {
      
        reverse(nums, 0,nums.length-1);
        k = k%nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

public void reverse(int[] nums, int start, int end){
    int temp=0;
    while(start<=end){
        temp=nums[end];
        nums[end]=nums[start];
        nums[start]=temp;
        start++;
        end--;   
    }
}
}