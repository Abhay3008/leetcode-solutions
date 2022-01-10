class Solution {
    int modulo=(int)1e9+7;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = n-odd;
        long res1 = power(4, odd);
        long res2 = power(5, even);
        return (int)((res1*res2) % modulo);
    }
    public long power(long x,long n){
        if(n==0) return 1;
         
           return n%2 == 0 ? power((x*x)%modulo, n/2)%modulo : (x*power((x*x)%modulo, (n-1)/2))%modulo;
    }
}