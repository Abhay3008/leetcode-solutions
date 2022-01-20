class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int l = 1, r = piles[0];
        for(int i : piles){
            //if(i<l)
            //    l = i;
            if(i>r)
                r = i;
        }
        int ans = r;
        while(l<r){
            k = l + (r-l)/2;
            if(check(piles, k, h)==true)
            {
                ans = k;
                r = k;
            }
            else{
                l = k+1;
            }
        }
        return ans;
    }
    public boolean check(int[] piles, int k, int h){
        int hour = 0;
        for(int i = 0;i<piles.length;i++){
            hour += Math.ceil((double) piles[i]/k);
        }
      //  System.out.println(h);
        if(hour<=h) return true;
        return false;
    }
}