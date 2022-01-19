class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int p1 = 0,p2 = 0;
        if(name.charAt(p1)!=typed.charAt(p2))
            return false;
        while(p1<name.length() ){
            if(p2>= typed.length())
                return false;
            if(name.charAt(p1)==typed.charAt(p2)){
                p1++;
                p2++;
                continue;
            }
            else{
                if(typed.charAt(p2)==typed.charAt(p2-1)){
                    p2++;
                    continue;
                }
                return false;
            }
        }
        while(p2<typed.length()){
            if(typed.charAt(p2)!=typed.charAt(p2-1))
                return false;
            p2++;
        }
        return true;
    }
}