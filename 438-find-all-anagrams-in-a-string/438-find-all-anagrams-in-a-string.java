class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<Integer>();
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<p.length();i++){
            freq1[(int)(p.charAt(i) - 'a')]++;
        }
        for(int i=0;i<p.length();i++){
            freq2[(int)(s.charAt(i) - 'a')]++;
        }
        if(check(freq1,freq2)) ans.add(0);
        
        for(int i=p.length();i<s.length();i++){
            freq2[(int)(s.charAt(i) - 'a')]++;
            freq2[(int)(s.charAt(i-p.length()) - 'a')]--;
            if(check(freq1,freq2)) ans.add(i-p.length()+1);
        }
        return ans;
    }
    public Boolean check(int a[],int[] b){
        
        for(int i = 0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}