class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int c = 0;
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                c++;
                System.out.print(map.get(k-nums[i]));
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{
                
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return c;
    }
}