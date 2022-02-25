class Solution {
    public int compareVersion(String v1, String v2) {
        
        int i = 0,j=0;
        while(i<v1.length() && j < v2.length()){
            while(i<v1.length() && v1.charAt(i)==0)
                i++;
            while(j<v2.length() && v2.charAt(j)==0)
                j++;
            int n1 = 0,n2=0;
            while(i<v1.length() && v1.charAt(i)!='.'){
                int x = (int)(v1.charAt(i) - '0');
                n1 = n1*10 + x;
                i++;
            }
            while(j<v2.length() && v2.charAt(j)!='.'){
                int x = (int)(v2.charAt(j) - '0');
                n2 = n2*10 + x;
                j++;
            }
            if(n1>n2) return 1;
            if(n1<n2) return -1;
            i++;
            j++;
        }
        while(i<v1.length()){
            int x = (int)(v1.charAt(i) - '0');
            if(x>0) return 1;
            i++;
        }
         while(j<v2.length()){
            int x = (int)(v2.charAt(j) - '0');
            if(x>0) return -1;
             j++;
        }
        return 0;
    }
}