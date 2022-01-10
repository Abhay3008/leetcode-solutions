class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        return comb("", digits);
    }
    public List<String> comb(String p, String up){
       if(up.isEmpty()){
           List<String> l = new ArrayList<String>();
           l.add(p);
           return l;
       }
        int dig = up.charAt(0) - '0';
        int i = (dig - 2)*3;
        int n = (dig - 1)*3;
        if(dig == 7){ n++;}
        if(dig == 8){ i++; n++;}
        if(dig == 9){i++; n+=2;}
        List<String> ans = new ArrayList<String>();
        for(;i<n;i++){
            char ch = (char)('a'+i);
            ans.addAll(comb(p+ch, up.substring(1)));
        }
        return ans;
        
    }
}