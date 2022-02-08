class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1=0,num2=0;
        Map<Integer, Integer> mp = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                num1 = mp.get(target-nums[i]);
                num2 = i;
                break;
            }
            mp.put(nums[i],i);
            }
        
        int result[] = {num1, num2};
        return result;
    }
}