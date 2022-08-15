class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Set<String> set = new HashSet<String>();
        for(int i = 0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        List<Integer> x = new ArrayList<Integer>();
        x.add(0);
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<x.size();j++){
                if(set.contains(s.substring(x.get(j),i+1))){
                    x.add(i+1);
                    break;
                }
            }
        }
        // for(int j = 0;j<x.size();j++){
        //     System.out.print(x.get(j)+" ");
        // }
        if(x.get(x.size()-1)==s.length())
            return true;
        return false;
    }
}