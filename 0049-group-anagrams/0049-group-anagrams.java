class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] ch  = s.toCharArray();
            Arrays.sort(ch);
            String newstr = String.valueOf(ch);
            if(!map.containsKey(newstr)){
                map.put(newstr,new ArrayList<>());
            }
            
                map.get(newstr).add(s);
            
        }
        
        return new ArrayList<>(map.values());
        
    }
}