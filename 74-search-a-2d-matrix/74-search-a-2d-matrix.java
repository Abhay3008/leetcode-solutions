class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length*matrix[0].length;
        while(l != r){
            int mid = l + (r-l)/2;
            if(matrix[mid/matrix[0].length][mid%matrix[0].length]==target)
                return true;
            else if(matrix[mid/matrix[0].length][mid%matrix[0].length]<target)
                l = mid+1;
            else 
                r = mid;
        }
        return false;
    }
}