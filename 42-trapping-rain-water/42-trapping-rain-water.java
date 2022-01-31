class Solution {
    public int trap(int[] height) {
        int lmax[] = new int[height.length];
        int rmax[] = new int[height.length];
        lmax[0] = height[0];
        for(int i = 1;i<lmax.length;i++)
            lmax[i] = Math.max(height[i],lmax[i-1]);
        rmax[rmax.length-1] = height[rmax.length-1];
        for(int i = rmax.length-2;i>=0;i--)
            rmax[i] = Math.max(height[i],rmax[i+1]);
        int res = 0;
        for(int i = 0;i<lmax.length;i++){
            res+= Math.min(rmax[i],lmax[i]) - height[i];
         //   System.out.print(res+" ");
        }
        return res;
    }
}