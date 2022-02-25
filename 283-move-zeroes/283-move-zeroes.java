class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes=0;
        for(int i = 0;i<nums.length;i++)
            if(nums[i]==0) zeroes++;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                int j = i+1;
                while(j<nums.length && nums[j]==0)
                    j++;

                
                for(int k = i;j<nums.length;j++,k++){
                    nums[k] = nums[j];
                    
                }
            }
        }
        //System.out.print(zeroes);
        for(int i = 0;i<zeroes;i++){
            nums[nums.length-i-1]=0;
        }
        
    }
}