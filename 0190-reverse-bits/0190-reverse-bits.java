public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int ans = 0;
        int i=0;
        while(i++<32){
            int bit = n&1;
            ans = ans<<1;
            ans= ans|bit;
            n = n>>1;
            
        }
        return ans;
    }
}