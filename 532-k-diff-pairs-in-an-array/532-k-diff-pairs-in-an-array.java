class Solution {
    public int findPairs(int[] nums, int k) {
    /*    Arrays.sort(nums);
        int l = 0,h = nums.length-1,c=0;
        while(l<h){
            if(Math.abs(nums[l]-nums[h])==k){
                c++;
                while(l<h&&nums[l]==nums[l+1]) l++;
                while(l<h&&nums[h]==nums[h-1]) h--;
                l++;
                h--;
            }
            else if(k>Math.abs(nums[l]-nums[h]))h--;
            else l++;
        }
        return c;*/
        Arrays.sort(nums);
        int c =0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    c++;
                    while(j<nums.length-1&&nums[j]==nums[j+1]) j++;
                    while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
                }
            }
        }
        return c;
    }
}