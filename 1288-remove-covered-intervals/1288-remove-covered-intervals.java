class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       int i=0,n=intervals.length;
        while(i<intervals.length-1){
            int j = i+1;
            while(j<intervals.length && ((intervals[j][0]>=intervals[i][0] && intervals[j][1]<=intervals[i][1]))){
                j++;
                n--;
            }
            if(j<intervals.length && (intervals[j][0]<=intervals[i][0] && intervals[j][1]>=intervals[i][1])){
                i=j;
                j++;
                n--;
            }
            else
            i=j;
        }
        return n;
    }
}