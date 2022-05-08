class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        for(int i = 0;i<nums1.length;i++){
            
            for(int j = 0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    for(int k = j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            nums1[i]=nums2[k];
                            break;
                        }
                    }
                    if(nums1[i]==nums2[j])
                        nums1[i]=-1;
                    break;
                }
            }
        }
        return nums1;
    }
}