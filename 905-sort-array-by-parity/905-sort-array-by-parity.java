class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0,end = nums.length-1;
        while(start<end){
            while(start<end && nums[start]%2==0)
                start++;
            if(start<end && nums[end]%2==0){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
            }
            end--;
        }
        return nums;
    }
}