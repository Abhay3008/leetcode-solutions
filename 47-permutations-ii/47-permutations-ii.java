class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(nums[0]);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = helper(nums,ls,1);
        for(int i = 0;i<list.size();i++){
            set.add(list.get(i));
        }
        list.clear();
        for(List<Integer> l:set)
            list.add(l);
        return list;
    }
    List<List<Integer>> helper(int[] nums,List<Integer> ls, int up){
        
        if(up==nums.length){
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            list.add(new ArrayList<Integer>());
            for(int i = 0;i<ls.size();i++)
                list.get(0).add(ls.get(i));
            return list;
        }
        int a = nums[up];
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>(ls);
        for(int i = 0;i<=ls.size();i++){
            temp.add(i,a);
            list.addAll(helper(nums,temp,up+1));
            temp.remove(i);
        }
        return list;
    }
}