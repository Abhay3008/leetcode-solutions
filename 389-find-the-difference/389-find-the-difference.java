class Solution {
    public char findTheDifference(String s, String t) {
        int count[] = new int[26];
        for(int i = 0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<26;i++){
            if(count[i]<0)
                return (char)(i + 'a');
        }
        return ' ';
        
    }
}