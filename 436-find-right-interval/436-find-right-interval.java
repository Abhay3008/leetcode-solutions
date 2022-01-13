class Solution {
    public int[] findRightInterval(int[][] arr) {
        int [] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
            ans[i] = -1;
        for(int i = 0;i<arr.length;i++){
            int end = arr[i][1];
            for(int j =0;j<arr.length;j++){
                if(arr[j][0] >= end ){    
                if(ans[i] == -1)
                {
                    ans[i] = j;
                    
                }
                else if(arr[j][0] < arr[ans[i]][0])
                    ans[i] = j;
                }
            }
         
        }
        return ans;
    }
}