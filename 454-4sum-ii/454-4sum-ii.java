class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        int cnt = 0, sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums1.length;i++)
            for(int j = 0;j<nums2.length;j++){
                sum = nums1[i] + nums2[j];
                mp.put(sum,  mp.getOrDefault(sum, 0) + 1);
                }
        for(int i = 0;i<nums3.length;i++)
            for(int j = 0;j<nums4.length;j++){
            int c = -(nums3[i]+ nums4[j]);
            cnt += mp.getOrDefault(c, 0);
                      
            }
        return cnt;
    }
}