class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> s1 = new ArrayList<Integer>();        
        Arrays.sort(nums1);
        
        
        for(int i= 0;i<nums1.length;i++){
            int start = 0,end = nums2.length - 1;
            int mid = 0,val =nums1[i];
        Arrays.sort(nums2);
            while(start <= end){
                mid = start + (end - start)/2;
                if(nums2[mid] == val){
                    s1.add(val);
                    nums2[mid] = -1;
                    break;
                }
                else if(val >nums2[mid])
                    start = mid+1;
                else if(val<nums2[mid])
                    end = mid-1;
            }
        }
        int[] arr = new int[s1.size()];
        int i=0;
        for(Integer n:s1){
            arr[i++]=n;
            
        }
        return arr;
    }
    
}