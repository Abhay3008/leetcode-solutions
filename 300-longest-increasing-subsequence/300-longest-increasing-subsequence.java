class Solution {
    public int lengthOfLIS(int[] nums) {
        int arr[] = new int[nums.length];
        int s = 0;
        for(int i = 0;i<nums.length;i++){
            int l = 0,r=s;
            while(l<r){
                int m = l+(r-l)/2;
                if(nums[i]>arr[m])
                    l = m+1;
                else
                    r = m;
            }
            arr[l]=nums[i];
            if(l==s) s++;
            
        }
           
        
        return s;
    }
   
    
}