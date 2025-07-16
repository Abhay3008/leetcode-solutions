class Solution {
    public String decodeString(String s) {
        Stack<int[]> st = new Stack<int[]>();
        int i=0;
        while(i<s.length()){
            int l = i;
            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                i++;
            }
            if(i>l){
                int b=convert(s.substring(l,i));
                st.push(new int[]{l,b});
                // System.out.println(s + " "+i);
            }
            // System.out.println(s + " 1"+i);
            if(s.charAt(i)==']'){
                int[] a = st.pop();
                String str = decode(s,a[0],i,a[1]);
                s = s.substring(0,a[0]) + str + s.substring(i+1,s.length());
                i = a[0] + str.length()-1;
            }
            
            i++;
        }
        return s;
    }
    public String decode(String s, int l, int r, int n){
        //  System.out.println(s);
        int i = l;
        while(s.charAt(i)!='[')
            i++;
        String str = s.substring(i+1,r);
        String res="";
        while(n>0){
            res = res + str;
            n--;
        }

        return res;
    }
    public int convert(String s){
        return Integer.parseInt(s);
    }
}