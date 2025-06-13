class Solution {
    public int subsetXORSum(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=traverse(nums,i+1,nums[i]);
        }
        return res;
    }

    public int traverse(int[] nums,int ind, int xor){
        if(ind>=nums.length) return xor;
        int res=xor;
        for(int i=ind;i<nums.length;i++){
            res+=traverse(nums,i+1,xor^nums[i]);
        }
        return res;

    }
}