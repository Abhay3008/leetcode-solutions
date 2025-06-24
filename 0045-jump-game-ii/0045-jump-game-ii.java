class Solution {
    public int jump(int[] nums) {
        int i=0,jump=0;
        while(i<nums.length){
            if(i==nums.length-1) return jump;
            if(i+nums[i]>=nums.length-1) return jump+1;
            int j=i+1,max=i;
            while(j<=i+nums[i] && j<nums.length){
                // if(j==nums.length-1 || j+nums[j]>=nums.length-1) return jump;
                if(j+nums[j]>max+nums[max]){
                    max = j;
                }
                j++;
            }
            if(i==max){
                i=i+nums[max];
            }
            else
                i=max;
            jump++;
        }
        return jump;
    }
}