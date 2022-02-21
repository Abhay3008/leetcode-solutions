class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] ch1 = new int[26];
        for(int i = 0;i<s.length();i++)
            ch1[(int)(s.charAt(i) - 'a')]++;
        for(int i = 0;i<t.length();i++)
            ch1[(int)(t.charAt(i) - 'a')]--;
        for(int i = 0;i<26;i++)
            if(ch1[i]!=0)
                return false;
        return true;
    }
}