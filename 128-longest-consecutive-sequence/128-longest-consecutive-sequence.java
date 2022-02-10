class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> mp = new HashMap<>();
        // mark all nums as unexplored 
        for(int i =0;i<nums.length;i++)
            mp.put(nums[i],false);
        
        int c =1,ans=0;
        // check if num-1 has all available and num+1 also 
        for(int i = 0;i<nums.length;i++){
            if(!mp.get(nums[i])==false)
                continue;
            int key = nums[i]-1;
            //System.out.print("hi");
            while(mp.containsKey(key)&&(mp.get(key)==false)){
               // System.out.print("hi");
                c++;
                mp.put(key,true);
                key--;
            }
            key = nums[i]+1;
            while(mp.containsKey(key)&&mp.get(key)==false){
                c++;
                mp.put(key,true);
                key++;
            }
            mp.put(nums[i],true);
            ans=Math.max(c,ans);
            c=1;
            
        }
        return (nums.length==0)?0:Math.max(ans,c);
    }
}