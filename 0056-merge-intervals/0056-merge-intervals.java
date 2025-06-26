class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(i<intervals.length && end>=intervals[i][0]){
                end = Math.max(end,intervals[i][1]);
                start = Math.min(start,intervals[i][0]);
                i++;
            }
            i--;
            list.add(new int[]{start,end});
        }
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}