class Solution {
    public boolean detectCapitalUse(String words) {
        if(words.length()==1) return true;
        if(words.charAt(0)>='A'&&words.charAt(0)<='Z'){
            if(words.charAt(1)>='A'&&words.charAt(1)<='Z'){
              //  System.out.print("he");
                for(int i = 2;i<words.length();i++){
                    if(words.charAt(i)>='a'&&words.charAt(i)<='z'){
                        return false;
                    }
                }
                return true;
            }
            else if(words.charAt(1)>='a'&&words.charAt(1)<='z'){
                for(int i = 2;i<words.length();i++){
                    if(words.charAt(i)>='A'&&words.charAt(i)<='Z'){
                        return false;
                    }
                }
                return true;
            }
        }
        else if(words.charAt(0)>='a'&&words.charAt(0)<='z'){
            for(int i = 1;i<words.length();i++){
                    if(words.charAt(i)>='A'&&words.charAt(i)<='Z'){
                    //    System.out.print("he");
                        return false;
                    }
                }
              //  System.out.print("he");
                return true;   
        }
        return true;
    }
}