class Solution {
    public int threeSumMulti(int[] nums, int target) {
         Arrays.sort(nums);
        int mod = 1_000_000_007;
        long c=0;
        for(int i= 0;i<nums.length;i++){
                int l=i+1,h = nums.length-1, tar = target-nums[i];
            while(l<h){
                if(tar==nums[l]+nums[h]){
                    if(nums[l]!=nums[h]){
                        int left=1,right=1;
                    while(l+1<h&&nums[l]==nums[l+1]){ l++;left++;}
                    while(h-1>l&&nums[h]==nums[h-1]) {h--;right++;}
                    l++;
                    h--;
                    c+=left*right;
                    c%=mod;
                    }
                    else{
                        c += (h-l+1) * (h-l) / 2;
                        c %= mod;
                        break;
                    }
                }
                else if(tar>(nums[l]+nums[h])) l++;
                else h--;
            }
            
        }
        return (int)c;
    }
}