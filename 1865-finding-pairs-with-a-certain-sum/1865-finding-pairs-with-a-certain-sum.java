class FindSumPairs {
    int[] nums1,nums2;
    HashMap<Integer,Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int i = 0;i<nums2.length;i++)
        addfreq(nums2[i],1);
    }
    public void addfreq(int num,int c){
        map.put(num,map.getOrDefault(num,0)+c);
        
    }
    
    public void add(int index, int val) {
        addfreq(nums2[index],-1);
        nums2[index] += val;
        addfreq(nums2[index],1);
        
    }
    
    public int count(int tot) {
        int c = 0;
        for(int i = 0;i<nums1.length;i++){
                c+=map.getOrDefault(tot-nums1[i],0);
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */