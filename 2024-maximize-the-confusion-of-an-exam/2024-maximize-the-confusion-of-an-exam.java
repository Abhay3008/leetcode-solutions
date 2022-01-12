class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int t = 0, f = 0;
        int x=0, y = 0, key=k;
        if(answerKey.length()==1) return 1;
        char ch[] = answerKey.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i]=='T'){
                x++;
                y=0;
            }
            else if(ch[i]=='F'){
                y++;
                x=0;
            }
            if(x>t)
                t = x;
            if(y>f)
                f = y;
        }
       // System.out.print(t);
         x = 0;
        int tempx=0;
        Queue<Integer> q = new LinkedList<>();
        for(int l = 0, r = 0;r<ch.length;r++){
            if(ch[r]=='T'){
                x++;
            }
            else if(ch[r]=='F'){
                if(k>0){
                    x++;
                    //System.out.print(x-(q.peek()==null?0:tempx) + " ");
                    q.add(r);
                    
                    tempx = x;
                    System.out.print(tempx+" ");
                    k--;
                }
                else{
                    
                    x = r-q.remove();
                    q.add(r);
                    tempx = x;
                    System.out.print(tempx+" ");
                }
            }
            if(x>t)
                t=x;    
        }
        x = 0; tempx=0;
        q.clear();
        for(int l = 0, r = 0;r<ch.length;r++){
            if(ch[r]=='F'){
                x++;
            }
            else if(ch[r]=='T'){
                if(key>0){
                    x++;
                    q.add(r);
                    tempx = x;
                    key--;
                }
                else{
                    x = r - q.remove();
                    q.add(r);
                    tempx = x;
                }
            }
            if(x>f)
                f=x;    
        }
        System.out.print(t+" ");
        System.out.print(f);
        
        return Math.max(t,f);
        
    }
}