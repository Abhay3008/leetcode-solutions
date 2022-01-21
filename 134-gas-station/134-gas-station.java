class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0;i<gas.length;i++){
            if(gas[i]==0) continue;
            if(gas[i]<cost[i])
                continue;
            int start = i;
            int n = gas.length;
            int tank = gas[i] - cost[i];
            
            for(int j = start<(n-1)?(start+1):0;j<n;j++){
                tank = tank + gas[j] - cost [j];
               // System.out.print(tank+" ");
                if(tank<0) break;
                if(j==start) return start;
                if(j==(gas.length-1)){
                    n = start+1;
                    j = -1;
                }
                
            }
        }
        return -1;
    }
}