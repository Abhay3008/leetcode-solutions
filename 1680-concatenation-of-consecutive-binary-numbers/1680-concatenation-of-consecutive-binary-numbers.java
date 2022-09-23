class Solution {
    public int concatenatedBinary(int n) {
        
        long ans = 0;
        int shift=0;
        for(int i = 1;i<=n;i++){
            
            if((i&(i-1))==0) shift++;
            ans=((ans<<shift)+i)%(long)(1000000007);
        }
        return (int)ans;
    }
}