class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        Queue<Integer> heap = new PriorityQueue<>((n1,n2)-> freq.get(n1) - freq.get(n2));
        for(int i : freq.keySet()){
            heap.add(i);
            if(heap.size()>k)
                heap.poll();
        }
        int ans[] = new int[k];
        for(int i = 0;i<k;i++){
            ans[ans.length-i-1] = heap.poll();
        }
        return ans;
    }
}