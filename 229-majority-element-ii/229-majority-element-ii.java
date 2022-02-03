class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n1 = nums[0], n2 = nums[0], cnt1 = 0, cnt2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==n1)
                cnt1 ++;
            else if(nums[i]==n2){
                cnt2++;
            }
            else if(cnt1==0)
            {
                n1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2==0)
            {
                n2 = nums[i];
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==n1)
                cnt1++;
            else if(nums[i]==n2)
                cnt2++;
        }
         if(cnt1 > nums.length/3)
            ans.add(n1);
        if(cnt2 > nums.length/3)
            ans.add(n2);
        return ans;
    }
}