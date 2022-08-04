class Solution {
    public int mirrorReflection(int p, int q) {
        if(p==q) return 1;
        int i = 1;
        while(true){
            if((i*p)%q==0)
                break;
            i++;
        }
        if(i%2==1){
            if(((i*p)/q)%2==0)
                return 2;
            else
                return 1;
            }
        else return 0;
    }
}