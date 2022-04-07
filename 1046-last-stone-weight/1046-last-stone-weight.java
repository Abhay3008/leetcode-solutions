class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        while(true){
            Arrays.sort(stones);
            int a = stones[stones.length-1];
            int b = stones[stones.length-2];
            System.out.println(a+" "+b);
            if(b==0)
                return a;
            if(a==b){
                stones[stones.length-1]=0;
                stones[stones.length-2]=0;
            }
            else{
                stones[stones.length-1]=stones[stones.length-1]-stones[stones.length-2];
                stones[stones.length-2]=0;
                
            }
        }
       // return -1;
    }
}