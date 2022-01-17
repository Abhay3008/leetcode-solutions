class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        int x = 0;
        for(int i = 0;i<matrix.length;i++){
            
            if(matrix[i][0]==0)
                x = 1;
            
            for(int j = 1;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
     //   System.out.print(ls);
        for(int i = 1;i<matrix.length;i++){
            for(int j = 1;j<matrix[i].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
            if(matrix[0][0]==0)
            for(int j = 0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        if(x==1)
            for(int j = 0;j<matrix.length;j++){
                matrix[j][0] = 0;
            }
        
       // return matrix;
    }
}