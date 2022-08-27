class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ind = 0;
        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=max){
                max = nums[i];
                ind = i;
                ans[i]=-1;
            }
        }
        Stack<pair> st = new Stack<>();
         //System.out.print(ind);
        int x = (ind+1)%nums.length;
        while(x!=ind){
            if(st.isEmpty()){
                st.push(new pair(x,nums[x]));
            }
            else{
                if(st.peek().val>=nums[x]){
                    st.push(new pair(x,nums[x]));
                }
                else{
                    while(!st.isEmpty() && st.peek().val<nums[x]){
                        pair p = st.pop();
                        ans[p.i] = nums[x];
                    }
                    st.push(new pair(x,nums[x]));
                }
            }
            x++;
            x = x%nums.length;
        }
        
        while(!st.isEmpty() && st.peek().val<nums[ind]){
                        pair p = st.pop();
                        ans[p.i] = nums[ind];
                    }
        return ans;
    }
}
class pair{
    int i;
    int val;
    pair(int i,int val){
        this.i = i;
        this.val = val;
    }
}