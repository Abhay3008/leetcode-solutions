class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0) return new ArrayList<String>();
        List<String> list = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int l = 0,r=0;
        for(int i = 0;i<nums.length-1;i++){
            r = i;
            if((nums[i]+1)!=nums[i+1]){
                if(l!=r){
                    list.add(nums[l]+"->"+nums[r]);
                }
                else
                list.add(nums[l]+"");
                l =r= i+1;
            }
        }
        r = nums.length-1;
            if(l!=r){
                    list.add(nums[l]+"->"+nums[r]);
                }
            else
                list.add(nums[l]+"");
        
        return list;
    }
}