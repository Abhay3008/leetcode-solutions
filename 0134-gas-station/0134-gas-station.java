class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int cand = -1;
        int tank = 0;
        for(int i=0;i<gas.length;i++){
            int fuel = gas[i]-cost[i];
            if(cand==-1){
                if(fuel>=0){
                    cand =  i;
                    tank = fuel;
                }
            }
            else{
                tank+=fuel;
            }
            if(tank<0){
                cand=-1;
                tank=0;
            }
        }
        if(tank<0) return -1;
        for(int j=0;j<cand;j++){
            int fuel = gas[j] - cost[j];
            tank +=fuel;
            if(tank<0) return -1;
        }
        // System.out.println(tank);
        return cand;
    }
}