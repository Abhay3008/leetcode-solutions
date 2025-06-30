class Solution {
    public String convertToTitle(int num) {
        StringBuilder sb = new StringBuilder("");
        while(num>0){
            
            int rem = num%26;
            // System.out.print(num);
            // System.out.println(" " +rem);
            if(rem==0)
                rem = 26;
            sb.insert(0,(char)('A'+rem-1));
            num=(num-1)/26;
        }
        return sb.toString();
    }
}