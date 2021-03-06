class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] ch1 = new int[26];
        for(int i = 0;i<magazine.length();i++)
            ch1[(int)(magazine.charAt(i) - 'a')]++;
        for(int i = 0;i<ransomNote.length();i++)
            ch1[(int)(ransomNote.charAt(i) - 'a')]--;
        for(int i = 0;i<26;i++)
            if(ch1[i]<0)
                return false;
        return true;
    }
}