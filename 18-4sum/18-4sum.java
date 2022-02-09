class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int x = 0;
        for(int i = 0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){
                int sum = target-nums[i];
                int flag = 0;
                for(int  j = i+1;j<nums.length;j++){
                    if(flag==0|| nums[j]!=nums[j-1]){
                        flag = 1;
                        int l=j+1,h = nums.length-1,tar = sum-nums[j];
                        while(l<h){
                            if(tar==nums[l]+nums[h]){
                            ls.add(new ArrayList<Integer>());
                            ls.get(x).add(nums[i]);
                            ls.get(x).add(nums[j]);
                            ls.get(x).add(nums[l]);
                            ls.get(x++).add(nums[h]);
                            while(l<h&&nums[l]==nums[l+1]) l++;
                            while(h>l&&nums[h]==nums[h-1]) h--;
                            l++;
                            h--;
                        }
                        else if (tar>nums[l]+nums[h]) l++;
                            else h--;
                    }
                }
            }
        }
    }
  return ls;      
}
}