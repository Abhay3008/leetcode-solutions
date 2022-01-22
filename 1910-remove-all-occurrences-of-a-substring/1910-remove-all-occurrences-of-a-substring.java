class Solution {
    public  String removeOccurrences(String s, String part) {
        char[] st = s.toCharArray();
        char[] p = part.toCharArray();
        while(true){
            int flag = 0;

            for(int i = 0;i<st.length;i++){
                int x = i, f = 1;
                for(int j = 0;j<p.length;x++){
                    if(x>=st.length){f=0; break;}
                    if(st[x]=='1') continue;
                    if(st[x]==p[j]){
                        j++;
                    }
                    else{
                        f = 0;
                        break;
                    }
                }
                if(f==1){
                    for(int j = i;j<x;j++)
                        st[j]='1';
                    flag = 1;
                    i=x-1;
                    break;
                }
            }
            if(flag ==0) break;
        }
        StringBuilder sb=new StringBuilder();
        for(int i = 0;i<st.length;i++)
            if(st[i]!='1')
                sb.append(st[i]);

        return sb.toString();
    }
}