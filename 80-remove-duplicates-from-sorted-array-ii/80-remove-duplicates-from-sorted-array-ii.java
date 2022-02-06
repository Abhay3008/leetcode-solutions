class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 1;i<n;i++){
            if(nums[i]==nums[i-1])
                count++;
            if(nums[i]!=nums[i-1])
                count = 0;
            if(count>=2){

                int j = i,size = n;
                for(;j<size;j++){
                    if(nums[j]!=nums[j-1])
                        break;
                    n--;
                }
               // System.out.println(i+" "+n);
                shift(i,j, nums);
                //n--;
                //if(nums[i]!=nums[i-1]){
                //    System.out.print(i); count = 0;}
                count = 0;
            }
        }
        return n;
    }
    public void shift(int i,int j, int[] nums){

        while(j<nums.length){
            nums[i] = nums[j];
            i++;
            j++;
        }
        return ;
    }
}
