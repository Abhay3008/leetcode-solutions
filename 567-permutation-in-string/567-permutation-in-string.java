class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
            int[] c1=new int[26];
        for(int i=0;i<s1.length();i++){
            c1[s1.charAt(i)-'a']++;
        }
        int[] c2=new int[26];
        for(int j=0;j<s1.length();j++){
                c2[s2.charAt(j)-'a']++;
            }
        int flag=1;
            for(int k=0;k<26;k++){
                if(c1[k]!=c2[k])
           
                    flag=0;
                }
            if(flag==1) return true;
        int x=0;
        for(int i=s1.length();i<s2.length();i++){
            c2[s2.charAt(x++)-'a']--;
            c2[s2.charAt(i)-'a']++;
             flag=1;
            //System.out.print("d");
            for(int k=0;k<26;k++){
                if(c1[k]!=c2[k])
           
                    flag=0;
                }
            if(flag==1) return true;
            
        }
        return false;
    }
}