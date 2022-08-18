class Solution {
    public int compare(int a, int b){
        return b-a;
    }
    public int minSetSize(int[] arr) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Integer> q = new PriorityQueue<>((a,b)-> b-a);
        for(int i = 0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            q.add(mp.getValue());
        }
        int count = 0,size = 0;
        
        while(size<arr.length/2){
            size += q.remove();
            count++;
        }
        return count;
        
    }
}
