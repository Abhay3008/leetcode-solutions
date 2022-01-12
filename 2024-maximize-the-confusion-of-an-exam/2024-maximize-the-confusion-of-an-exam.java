class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int t = 0, f = 0;
        int x=0, key=k;
        
        if(answerKey.length()==1) return 1;
        
        char ch[] = answerKey.toCharArray();
        
         x = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int l = 0, r = 0;r<ch.length;r++){
            if(ch[r]=='T'){
                x++;
            }
            else if(ch[r]=='F'){
                if(k>0){
                    x++;
                    q.add(r);
                    k--;
                }
                else{
                    
                    x = r-q.remove();
                    q.add(r);
                }
            }
            if(x>t)
                t=x;    
        }
    
    x = 0; 
    q.clear();
    for(int l = 0, r = 0;r<ch.length;r++){
            if(ch[r]=='F'){
             x++;
            }
            else if(ch[r]=='T'){
                if(key>0){
                    x++;
                    q.add(r);
                    key--;
                }
            else{
                    x = r - q.remove();
                    q.add(r);
                }
            }
        if(x>f)
                f=x;    
        }

        return Math.max(t,f);
        
    }
}