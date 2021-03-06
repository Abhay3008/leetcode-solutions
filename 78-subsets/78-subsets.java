class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        out.add(new ArrayList<>());
        for(int num : nums){
            
            int n = out.size();
           // System.out.print(n+" ");
            for(int i = 0;i<n;i++){
                List<Integer> in = new ArrayList<Integer>(out.get(i));
                in.add(num);
                out.add(in);
            }
            
        }
        return out;
    }
}