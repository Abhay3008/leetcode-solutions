class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int max = 0;
        int len = nums1.length>nums2.length?nums2.length:nums1.length;
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                map.get(nums2[i]).add(i);
            }
            else{
                map.put(nums2[i],new ArrayList<Integer>());
                map.get(nums2[i]).add(i);
            }
        }
        for(int i = 0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int n = map.get(nums1[i]).size();
                for(int x = 0;x<n;x++){
                    if(max==len || max>nums1.length-i-1)
                        return max;
                max = Math.max(max,check(nums1,nums2,i,map.get(nums1[i]).get(x)));
                }
                }
        }
        return max;
    }
    public int check(int[] nums1, int[] nums2,int x, int y){
        
        int count = 0;
        while(x<nums1.length && y<nums2.length){
            if(nums1[x]==nums2[y])
                count++;
            else
                return count;
            x++;
            y++;
        }
      //  if(count==4) System.out.print(x+" "+y);
        return count;
    }
}