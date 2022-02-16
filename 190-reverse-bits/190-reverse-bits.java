public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0,i=0;
        while(i++<32){
            int last = n&1;
            ans = (ans<<1) + last;
            n=n>>1;
        }
        return ans;
    }
}