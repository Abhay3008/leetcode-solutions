class Solution {
    public int jump(int[] nums) {
      int lastpos =0, max=0;
        int i = 0,count=0;
        while(lastpos<nums.length-1){
            max=Math.max(max,nums[i]+i);
            if(i==lastpos){
                lastpos=max;
                count++;
            }
            i++;
        }
        return count;
    }
}