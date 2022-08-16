class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        Queue<int[]> q = new PriorityQueue<int[]>((p1,p2)->getdis(p1).compareTo(getdis(p2)));
        int[][] ans = new int[k][2];
        for(int i = 0;i<points.length;i++){
            q.add(points[i]);
        }
        for(int i = 0;i<k;i++){
           
            ans[i] = q.remove();
        }
        return ans;
    }
    private Double getdis(int[] point) {
        return Math.sqrt((point[0] * point[0]) + (point[1] * point[1]));
    }
}
