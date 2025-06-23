class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] collection = new int[21];
        for(int i=0;i<bills.length;i++){
            if(!isChangePossible(collection,bills[i]-5))
                return false;
            collection[bills[i]]++;
        }
        return true;
    }
    public boolean isChangePossible(int[] collection, int money){
        int change[] = new int[]{20,10,5};
        // System.out.print(money+" ");
        for(int i=0;i<change.length;i++){
            while(collection[change[i]]>0 && money>=change[i]){
                // System.out.print(change[i]+" ");
                money = money - change[i];
                collection[change[i]]--;
            }
        }
        // System.out.println(money+" ");
        if(money>0) return false;
        return true;
    }
}