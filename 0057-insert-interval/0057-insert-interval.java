class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<int[]>();
        if(intervals.length==0){
            return new int[][]{{newInterval[0],newInterval[1]}};
        }
        if(newInterval[1] < intervals[0][0])
            list.add(new int[]{newInterval[0],newInterval[1]});
        for(int i=0;i<intervals.length;i++){
            if((intervals[i][0]>=newInterval[0] && intervals[i][0]<=newInterval[1]) || (intervals[i][0]<=newInterval[0] && intervals[i][1]>=newInterval[0])){
                int start = Math.min(intervals[i][0],newInterval[0]);
                int last = Math.max(intervals[i][1],newInterval[1]);
                while(i<intervals.length && newInterval[1] >= intervals[i][0] ){
                    last = Math.max(intervals[i][1],newInterval[1]);
                    i++;
                }
                list.add(new int[]{start,last});
            }
            if(i<intervals.length)
                list.add(new int[]{intervals[i][0],intervals[i][1]});
            if(i<intervals.length-1 && newInterval[0]> intervals[i][0] && newInterval[1]<intervals[i+1][0])
                list.add(new int[]{newInterval[0],newInterval[1]});
        }
        if(newInterval[0] > intervals[intervals.length-1][1])
            list.add(new int[]{newInterval[0],newInterval[1]});
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}