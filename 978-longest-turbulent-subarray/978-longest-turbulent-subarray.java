class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int ans = 1;
        if(arr.length==1)
            return 1;
        int count = 2;
        int flag = arr[0]>arr[1]?0:1;
        if(arr[0]==arr[1]) count = 1;
        for(int i = 1;i<arr.length-1;i++){
            if(flag == 0){
                if(arr[i]<arr[i+1]){
                    flag = 1;
                    count++;
                }
                else{
                    ans = Math.max(ans,count);
                    if(arr[i]>arr[i+1]){
                        count = 2;
                    }
                    else
                        count = 1;
                }
            }
            else{
                if(arr[i]>arr[i+1]){
                    flag = 0;
                    count++;
                }
                else{
                    ans = Math.max(ans,count);
                    if(arr[i]<arr[i+1]){
                        count = 2;
                    }
                    else
                        count = 1;
                }
            }
        }
        return Math.max(ans,count);
    }
}