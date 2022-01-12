class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = k-1;
        char[] st = s.toCharArray();
        int max = 0;
        for(int i = 0;i<=r;i++)
        {
            if(st[i]=='a' || st[i]=='e' || st[i]=='i' || st[i]=='o' || st[i]=='u')
                max++;
        }
        
        
        int vow = max;
        
        
        for(l++, r++;r<st.length;r++, l++){
        if(st[l-1]=='a' || st[l-1]=='e' || st[l-1]=='i' || st[l-1]=='o' || st[l-1]=='u')
            vow--;
        if(st[r]=='a' || st[r]=='e' || st[r]=='i' || st[r]=='o' || st[r]=='u')
            vow++;
        if(vow>max)
            max = vow;
        }
        return max;
    }
}