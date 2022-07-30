class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2)   {
        int ch1[] = new int[26];
        int ch2[] = new int[26];

        for(int i = 0;i<words2.length;i++){
            for(int j = 0;j<words2[i].length();j++)
                ch2[words2[i].charAt(j)-'a']++;
            for(int j = 0;j<26;j++){
                ch1[j] = Math.max(ch1[j],ch2[j]);
                ch2[j] = 0;
            }
        }
        return find(words1,ch1,0,new ArrayList<String>());
    }
    public List<String> find(String[] w1, int[] ch1, int ind, List<String> ans){
        
        if(ind==w1.length)
            return ans;
        int flag = 0;
        int[] ch2 = new int[26];
        for(int i = 0;i<w1[ind].length();i++){
            ch2[w1[ind].charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(ch1[i]>ch2[i]){
                flag = 1;
                break;
            }
        }
        if(flag!=1)
            ans.add(w1[ind]);
        find(w1,ch1,ind+1,ans);
        return ans;
    }
 
    
}