class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      return find(nums, k) - find(nums, k-1);
    
}
    int find(int[] nums, int k)
    {
        int ans = 0;
        int l = 0,r=0;
        int odd=0;
        for(;r<nums.length;r++ ){
            if(nums[r]%2==1) odd++;
            while(odd>k){
                if(nums[l]%2==1) odd--;
                l++;
            }
            ans += (r-l+1);
        }
        return ans;
    }
}