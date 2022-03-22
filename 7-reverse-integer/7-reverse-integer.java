class Solution {
    public int reverse(int x) {
        int num=0,r;
        while(x!=0){
            r = x%10;
            if(num > Integer.MAX_VALUE/10 || num< Integer.MIN_VALUE/10){
            return 0;
            }
            num = r + num*10;
            
            x=x/10;
        }
        return (int)num;
    }
}