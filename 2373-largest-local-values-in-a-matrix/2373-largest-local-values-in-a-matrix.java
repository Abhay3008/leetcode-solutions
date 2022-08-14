class Solution {
    public int[][] largestLocal(int[][] grid) {
           int n = grid.length;
        int[][] largestLocalGrid = new int[n-2][n-2];
        for(int r = 0; r < largestLocalGrid.length; r++){
            for(int c = 0; c < largestLocalGrid[0].length; c++){
                int currLargestLocal = 0;
                for(int i = r; i <= r + 2; i++){
                    for(int j = c; j <= c + 2; j++){
                        currLargestLocal = Math.max(currLargestLocal, grid[i][j]);
                    }
                }
                largestLocalGrid[r][c] = currLargestLocal;
            }
        }
        return largestLocalGrid;
    }
}
   