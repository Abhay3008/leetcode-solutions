class Solution {
    public int[] findRightInterval(int[][] arr) {
       int ans[] = new int[arr.length];
        int first[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            first[i] = arr[i][0];
        }
        for(int i=0;i<arr.length;i++){
            ans[i] = find(first, arr[i][1]);
        }
        return ans;
    }
    int find(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            while(start<=end){
                int mid = start + (end-start )/2;
                if(target==arr[mid])
                   return mid;
                if(target>arr[mid])
                    start = mid+1;
                else 
                    end = mid-1;
                
            }
            if(start > arr.length-1)
                return -1;
            return start;
        }
        else{
            while(start<=end){
                int mid = start + (end-start )/2;
                if(target==arr[mid])
                   return mid;
                if(target>arr[mid])
                    end = mid-1;
                else 
                    start = mid+1;
                
            }
            if(end < 0)
                return -1;
            return end;
        }
    
    }
}