class Solution {
    public String removeKdigits(String num, int k) {
        
        int len = num.length();
        if(k==len) return "0";
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<len){
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        while(k>0){
            k--;
            st.pop();
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        while(res.length()>1 && res.charAt(0)=='0')
            res.deleteCharAt(0);
        return res.toString();
        
    }
}