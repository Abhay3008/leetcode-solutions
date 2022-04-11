class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        k = k % (grid.length * grid[0].length);
        
        for(int x = 0;x<k;x++){
            int temp1 = grid[grid.length-1][grid[0].length-1];
            int temp2 = 0;
            for(int i = 0;i<grid.length;i++){
                for(int j = 0;j<grid[0].length;j++){
                    temp2 = grid[i][j];
                    grid[i][j] = temp1;
                    temp1 = temp2;
                    
                }
            }
        }
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
            for(int i = 0;i<grid.length;i++){
                res.add(new ArrayList<Integer>());
                for(int j = 0;j<grid[0].length;j++){ 
                res.get(i).add(grid[i][j]);
                }
            }
        return  res;
    }
}