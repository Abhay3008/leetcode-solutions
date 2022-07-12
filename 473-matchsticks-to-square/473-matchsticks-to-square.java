class Solution {
    public boolean makesquare(int[] matchsticks) {
        
        int total = 0;
        for(int i : matchsticks)
            total+=i;
        if(total%4!=0) return false;
        
        Arrays.sort(matchsticks);
        return check(matchsticks, matchsticks.length-1,0,0,0,0,total/4);
    }
    public boolean check(int[] matchsticks, int i, int top, int right, int bottom, int left,int target){
        if(top==target&& bottom==target && right==target && left==target) return true;
        if(top>target||bottom>target || right>target || left>target) return false;
        if(i<0) return false;
        int val = matchsticks[i];
        if(check(matchsticks, i-1, top+val, right, bottom, left, target)) return true;
        if(check(matchsticks, i-1, top, right+val, bottom, left, target)) return true;
        if(check(matchsticks, i-1, top, right, bottom+val, left, target)) return true;
        if(check(matchsticks, i-1, top, right, bottom, left+val, target)) return true;
        return false;
    }
}