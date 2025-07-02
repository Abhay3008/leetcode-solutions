class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<ans.length;i++){
            ans[i] = countbits(i);
        }
        return ans;
    }
    public int countbits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n = n >> 1;
        }
        return count;
    }
}