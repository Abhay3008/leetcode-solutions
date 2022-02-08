class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int x = 0;
        for(int i= 0;i<nums.length-2;i++){
            if(i==0||nums[i]!=nums[i-1]){
                int l=i+1,h = nums.length-1, target = 0-nums[i];
            while(l<h){
                if(target==nums[l]+nums[h]){
                    ls.add(new ArrayList<Integer>());
                        ls.get(x).add(nums[i]);
                        ls.get(x).add(nums[l]);
                        ls.get(x++).add(nums[h]);
                    while(l<h&&nums[l]==nums[l+1]) l++;
                    while(h>l&&nums[h]==nums[h-1]) h--;
                    l++;
                    h--;
                }
                else if(target>(nums[l]+nums[h])) l++;
                else h--;
            }
            }
        }
        
        return ls;
    }
}