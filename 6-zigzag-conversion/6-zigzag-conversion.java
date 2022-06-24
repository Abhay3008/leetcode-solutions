class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> st = new ArrayList<StringBuilder>();
        
        for(int i = 0;i<Math.min(numRows, s.length());i++)
            st.add(new StringBuilder());
        
        int curr= 0;
        boolean flag = false;
        
        for(char c: s.toCharArray()){
            st.get(curr).append(c);
            if(curr==0||curr==numRows-1)
                flag=!flag;
            curr+=flag?1:-1;
            
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder r: st)
            ans.append(r);
        return ans.toString();
    }
}