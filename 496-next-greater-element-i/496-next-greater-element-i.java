class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                if(st.peek()>nums2[i]){
                    map.put(nums2[i],st.peek());
                }
                else{
                    while(st.size()>0 && nums2[i]>=st.peek())
                        st.pop();
                    if(!st.isEmpty()){
                        map.put(nums2[i],st.peek());
                    }
                    else
                        map.put(nums2[i],-1);
                }
            }
            st.push(nums2[i]);
        }
        int i=0;
        for(int x:nums1){
            nums1[i++] = map.get(x);
        }
        return nums1;
    }
}