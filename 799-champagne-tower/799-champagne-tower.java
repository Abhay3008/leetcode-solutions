class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double arr[][] = new double[102][102];
        arr[0][0] = (double)(poured);
        for(int i = 0;i<=query_row;i++){
            for(int j = 0;j<=i;j++){
                double left = (arr[i][j]-1.0)/2.0;
                if(left>0){
                    arr[i+1][j]+=left;
                    arr[i+1][j+1]+=left;
                }
            }
        }
        if(arr[query_row][query_glass]<1)
        return arr[query_row][query_glass];
        return 1;
    }
}