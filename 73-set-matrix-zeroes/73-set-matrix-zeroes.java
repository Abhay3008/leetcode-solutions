class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        int x = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                   // l.add(i);
                    //l.add(j);
                    //ls.add(l);
                    //l.clear();
                    ls.add(new ArrayList<Integer>(Arrays.asList(i, j)));
                }
            }
        }
     //   System.out.print(ls);
        for(int i = 0;i<ls.size();i++){
            for(int j = 0;j<matrix[ls.get(i).get(0)].length;j++){
                matrix[ls.get(i).get(0)][j] = 0;
            }
            for(int j = 0;j<matrix.length;j++){
                matrix[j][ls.get(i).get(1)] = 0;
            }
        }
       // return matrix;
    }
}