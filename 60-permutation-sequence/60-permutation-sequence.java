class Solution {
    int num = 0;
    public String getPermutation(int n, int k) {
        List<Character> list = new ArrayList<Character>();
        
        for(int i = 1;i<=n;i++)
            list.add((char)(i+'0'));
        // System.out.print(list);
        List<String> ans=find(list, "",new ArrayList<String>(),k);

        return ans.get(0);
    }
    public List<String> find(List<Character> list, String s, List<String> ans, int k){
        
        if(list.size()==0)
            num++;
        if(num==k){
            ans.add(s);
            return ans;
        }
        for(int i = 0;i<list.size();i++){
            char ch = list.get(i);
            list.remove(i);
            find(list,s+ch,ans,k);
            list.add(i,ch);
        }
        return ans;
    }
}