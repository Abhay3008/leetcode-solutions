class Solution {
    int num = 0;
    public String getPermutation(int n, int k) {
        List<Character> list = new ArrayList<Character>();
        for(int i = 1;i<=n;i++)
            list.add((char)(i+'0'));
        int[] fact = new int[n];
        fact[0]=1;
        for(int i = 1;i<n;i++){
            fact[i] = i*fact[i-1];
        }
        k = k-1;
        String s = "";
        for(int i = n;i>0;i--){
            int x = k/fact[i-1];
            k = k%fact[i-1];
            s+=list.get(x);
            list.remove(x);
            
        }
        // System.out.print(list);
        
        return s;

    }
}