class Solution {
    public boolean isValid(String st) {
        char s[] = st.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(char i:s){
            if(i=='(' || i=='{' || i=='[')
                stk.push(i);
            else if(!stk.empty()){
                if(i == ')' && stk.peek() =='(')
                    stk.pop();
                else if(i == ']' && stk.peek() =='[')
                    stk.pop();
                else if(i == '}' && stk.peek() =='{')
                    stk.pop();
                else
                    return false;
            }
            else return false;
        }
        if(stk.empty())
        return true;
        
        return false;      
    }
}