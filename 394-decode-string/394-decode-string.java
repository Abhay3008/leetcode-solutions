class Solution {
    public String decodeString(String s) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i = 0;i<s.length();i++){
            s1.push(s.charAt(i));
        }
        List<Character> ls = new ArrayList<>();
        while(!s1.isEmpty()){
            char a = s1.pop();
            if(a == ']' || a=='[' || (a>='a' && a<='z')){
               // System.out.print(a+" ");
                s2.push(a);
            }
            else{
                int x = (int)(a - '0');
                int r = 10;
                while(!s1.isEmpty() && s1.peek()>='0' && s1.peek()<='9')
                {
                    x = (int)(s1.pop() - '0')*r + x;
                    r*=10;
                }
               // System.out.print(s2.peek()+" ");
                    s2.pop();
                while(s2.peek()!=']'){
                    ls.add(s2.pop());
                }
             //   System.out.print(s2.peek()+" ");
                s2.pop();
                //System.out.print(ls+" ");
                for(int i = 0;i<x;i++){
                    for(int j=ls.size()-1;j>=0;j--){
                        s2.push(ls.get(j));
                      //  System.out.print(s2.peek()+" ");
                    }
                }
                ls.clear();
            }
        }
         StringBuilder sb = new StringBuilder();
    
        while(!s2.isEmpty())
         {
           // System.out.print(s2.peek()+" ");
            sb.append(s2.pop());
        }
 
        return sb.toString();
    }
}