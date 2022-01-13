class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        for(int i = 1;i<arr.length;i++)
            arr[i] += arr[i-1];
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        int sum = 0;
        for(int jump = 1;jump<=arr.length;jump+=2){
            
            for(int i = jump-1;i<arr.length;i++){
                if(i-jump <0){
                    sum+=(arr[i] - 0);
                }
                else
                    sum += (arr[i] - arr[i-jump ]);
            }
        }
        return sum;
    }
}