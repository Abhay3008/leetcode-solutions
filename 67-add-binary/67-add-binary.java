class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();  
        int i = a.length()-1,j=b.length()-1,carry=0;
        while(i>=0 && j>=0){
            int x = (int)(a.charAt(i) - '0');
            int y = (int)(b.charAt(j) - '0');
           
            int ans = x+y+carry;
             System.out.print(ans);
            sb.insert(0,(char)((ans%2)+'0'));
            System.out.print(sb+" ");
            carry = ans/2;
            i--;
            j--;
        }
        while(i>=0){
            int x = (int)(a.charAt(i)-'0');
            int ans = x+carry;
            sb.insert(0,(char)((ans%2)+'0'));
            carry= ans/2;
            i--;
        }
        while(j>=0){
            int x = (int)(b.charAt(j)-'0');
            int ans = x+carry;
            sb.insert(0,(char)((ans%2)+'0'));
            carry= ans/2;
            j--;
        }
        if(carry>0) sb.insert(0,(char)(carry+'0'));
        return sb.toString();
    }
}