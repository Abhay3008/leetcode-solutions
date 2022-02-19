class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();
        for(int x = 0;x<Math.min((matrix.length/2) + (matrix.length%2),(matrix[0].length/2) + (matrix[0].length%2));x++){
            int i = x;
            int j = i;
            for(;j<matrix[0].length-x;j++)
                ans.add(matrix[i][j]);
            
            for(i=x+1,j = matrix[0].length-x-1;i<matrix.length-x;i++)
                ans.add(matrix[i][j]);
            
           // System.out.print(j);
            for(i = matrix.length-x-1,j= matrix[0].length-x-2;j>=x&& i!=x;j--)
               ans.add(matrix[i][j]);
           
           for(i=matrix.length-x-2,j=x;i>x && j<matrix[0].length-x-1;i--)
               ans.add(matrix[i][j]);   
        }
        return ans;
    }
}