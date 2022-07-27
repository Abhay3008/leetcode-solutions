class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        
        int[] exist = new int[26];
        int[][] prefix = new int[s.length()+1][26];
        int[] min = new int[26];
        int[] max = new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);
        Arrays.fill(max,-1);
        for(int i = 0;i<s.length();i++){
            System.arraycopy(prefix[i],0,prefix[i+1],0,26);
            prefix[i+1][s.charAt(i)-'a']++;
            min[s.charAt(i)-'a'] = Math.min(min[s.charAt(i)-'a'],i);
            max[s.charAt(i)-'a'] = Math.max(max[s.charAt(i)-'a'],i);
            exist[s.charAt(i)-'a']=1;
        }
        
        int graph[][] = new int[26][26];
        for(int i = 0;i<26;i++){
            if(exist[i]==1){
                for(int j = 0;j<26;j++){
                    if(prefix[max[i]+1][j]>prefix[min[i]][j])
                        graph[i][j] = 1;
                }
            }
        }
        
                    
        int vis[] = new int[26];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<26;i++){
            if(exist[i]==1 && vis[i]!=1){
                dfs(i,graph,vis,st);
            }
        }
        
        int sets[] = new int[26];
        int set = 0;
        int outdegree[] = new int[26];
        Arrays.fill(sets,-1);
        while(!st.isEmpty()){
            
            int x = st.pop();
            if(sets[x]<0){
                dfs(x,sets,outdegree,set,graph);
                    set++;
            }
        }
        // for(int i =0;i<26;i++)
        // System.out.print(max[i]+" ");
        List<String> ans = new ArrayList<>();
        for(int i = set-1;i>=0;i--){
            if(outdegree[i]==0){
                int mn = Integer.MAX_VALUE,mx=-1;
                for(int j = 0;j<26;j++){
                    if(sets[j]==i){
                        mn = Math.min(min[j],mn);
                        mx = Math.max(max[j],mx);
                    }
                }
                ans.add(s.substring(mn,mx+1));
            }
        }
        return ans;
        
    }
    public void dfs(int curr, int[][] graph, int[] vis, Stack<Integer> st){
        if(vis[curr]!=1){
        vis[curr]=1;
        
        for(int i = 0;i<26;i++){
            if(graph[curr][i]==1 && vis[i]!=1)
                dfs(i,graph,vis,st);
        }
        st.push(curr);
        }
    }
    void dfs(int curr,int[] sets,int[] outdegree,int set,int[][] graph){
        if(sets[curr]<0){
            sets[curr]=set;
            for(int i = 0;i<26;i++){
                if(graph[i][curr]==1)
                    dfs(i,sets,outdegree,set,graph);
            }
        }
        else{
            if(sets[curr]!=set)
                outdegree[sets[curr]]++;
        }
    }
}