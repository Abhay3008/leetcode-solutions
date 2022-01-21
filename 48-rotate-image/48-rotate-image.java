class Solution {
    public void rotate(int[][] mat) {
        for(int x = 0;x<mat.length/2;x++){

            int a= 0;
            //for(int i = x;i<mat.length;i++){
                for(int j = x, i = x;j<mat.length-1-x;j++){
                    a = mat[i][j];
                    mat[i][j]=mat[mat.length-1-j][i];
                    mat[mat.length-1-j][i]=mat[mat.length-1-i][mat.length-1-j];
                    mat[mat.length-1-i][mat.length-1-j]=mat[j][mat.length-1-i];
                    mat[j][mat.length-1-i] = a;
                }
          /*  for (int i = 0; i < mat.length; i++){
                for (int j = 0; j < mat[0].length; j++)
                    System.out.print(mat[i][j] + " ");
                System.out.println();
            }*/
          //  }
        }
    }
}