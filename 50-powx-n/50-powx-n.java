class Solution {
    public double myPow(double x, int n) {
        long a = n;
        a=Math.abs(a);
        return n>0?pow(x, a):1/pow(x, a);
        
    }
    double pow(double x, long n){
        if(n==0) return 1;
         
           return n%2 == 0 ? pow(x*x, n/2) : x*pow(x*x, (n-1)/2); 
    }
}