class Solution {
public int maxConsecutiveAnswers(String answerKey, int k) {

        int t = 0;
        int x=0, key=k, ans = 0;

        if(answerKey.length()==1) return 1;

        char ch[] = answerKey.toCharArray();
         char i = 'T';
        x = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int j = 1;j<=2;j++) {
            if(j==1) i = 'T';
            else i = 'F';
            x=0;
            k = key;
            for (int r = 0; r < ch.length; r++) {
                if (ch[r] == i) {
                    x++;
                } else {
                    if (k > 0) {
                        x++;
                        q.add(r);
                        k--;
                    } else {

                        x = r - q.remove();
                        q.add(r);
                    }
                }
                if (x > t)
                    t = x;
            }
            if(t>ans)
                ans = t;
            t = 0;
            q.clear();
        }
              

        return ans;

    }
}