class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> q = new LinkedList<>();
        if(s.length()==0 ) return true;
        if(t.length()==0) return false;
        for(int i = 0;i<s.length();i++)
            q.add(s.charAt(i));
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i)==q.peek())
                q.remove();
            if(q.isEmpty()) return true;
        }
        if(q.isEmpty()) return true;
        return false;
    }
}