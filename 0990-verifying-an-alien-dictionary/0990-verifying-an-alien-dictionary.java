class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] count = new int[26];
        for(int i=0;i<order.length();i++){
            count[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length-1;i++){
                char[] a = words[i].toCharArray();
                char[] b = words[i+1].toCharArray();
                int x=0,y=0;
                while(x<a.length && y<b.length){
                    if(a[x]!=b[y] && count[a[x]-'a'] > count[b[y]-'a']){
                        System.out.println(a[x]);
                        return false;
                    }
                    if(a[x]!=b[y] && count[a[x]-'a'] < count[b[y]-'a']){
                        System.out.println(a[x]);
                        break;
                    }
                    x++;
                    y++;
                }
                if(x<a.length && y==b.length)
                    return false;
        }
        // System.out.println(count[0]);
        return true;
    }
}