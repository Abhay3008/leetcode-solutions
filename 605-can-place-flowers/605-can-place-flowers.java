class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if(n==0)
            return true;
        if(nums.length==1)
            if(nums[0]==0)
                return true;
            else
                return false;
        if(nums[0]==0 && nums[1]==0 ){
            n--;
            nums[0]=1;
        }
    
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==0){
                if(nums[i-1]==0 && nums[i+1]==0){
                    n--;
                    nums[i]=1;
                }
            }
        }
        if(nums[nums.length-1]==0 && nums[nums.length-2]==0){
            n--;
            nums[nums.length-1]=1;
        }
        
    if(n<=0)
        return true;
    return false;
    }
}