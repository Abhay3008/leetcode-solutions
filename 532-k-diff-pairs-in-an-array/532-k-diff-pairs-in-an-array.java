class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        for(int i = 0;i<nums.length;i++){
         int l = i+1,h = nums.length-1;
         while(l<=h){
             int mid = l+(h-l)/2;
            if(Math.abs(nums[i]-nums[mid])==k){
                c++;
                while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
                break;
               // while(l<h&&nums[l]==nums[l+1]) l++;
                
                //l++;
                //h--;
            }
            else if(k>Math.abs(nums[i]-nums[mid]))l = mid+1;
            else h=mid-1;
         }
        }
        return c;
        
    }
}