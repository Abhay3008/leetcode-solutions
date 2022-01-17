class Solution {
    public void nextPermutation(int[] nums) {
        for(int i =nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                int min = i;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j] > nums[i-1] && nums[j]<=nums[min])
                        min = j;
                }
                
                int temp = nums[min];
                nums[min] = nums[i-1];
                nums[i-1] = temp;
                reverse(nums, i);
                return ;
            }
        }
        Arrays.sort(nums);
    }
      private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}