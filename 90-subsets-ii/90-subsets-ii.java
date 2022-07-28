class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        ls.add(new ArrayList<Integer>());
        return find(nums,0,0, ls);
    }
    public List<List<Integer>> find(int[] nums, int i,int flag, List<List<Integer>> ls){
        
        if(i==nums.length)
            return ls;
        
            
        int n = ls.size();
        int j = 0;
        if(i>0&&nums[i]==nums[i-1])
            j=flag;
        flag = n;
        for(;j<n;j++){
            ls.add(new ArrayList<Integer>());
            ls.get(ls.size()-1).addAll(ls.get(j));
            ls.get(ls.size()-1).add(nums[i]);
        }
       // System.out.println(ls+" ");
        return find(nums,i+1,flag,ls);
        
    }
}