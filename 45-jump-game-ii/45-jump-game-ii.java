class Solution {
    /*
    do bfs from cuirrent index aur dekh ki max kahan tak jaa skta h wahan se aur wahan tak jaa aur update krr ki kya yahan se kahin duur jaa skte hain
    aur agar lastpos pr aa jae toh last pos ko update krr max kahan tak jaa skte hain.
    */
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