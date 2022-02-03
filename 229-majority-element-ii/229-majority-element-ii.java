class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int cnt = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                cnt ++;
            else{
                if(cnt > nums.length/3)
                    ans.add(nums[i-1]);
                cnt = 1;
            }
        }
         if(cnt > nums.length/3)
                    ans.add(nums[nums.length-1]);
        return ans;
    }
}