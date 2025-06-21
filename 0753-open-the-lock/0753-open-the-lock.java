class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> vis = new HashSet<String>();
        for(int i=0;i<deadends.length;i++){
            vis.add(deadends[i]);
        }
        Queue<String> q = new LinkedList<String>();
        int count=0;        
        if(!vis.contains("0000")){
            q.add("0000");
        }
        vis.add("0000");
       
        while(!q.isEmpty()){
            int size=q.size();

            for(int x=0;x<size;x++){
                String temp = q.poll();
                if(temp.equals(target)){
                        return count;
                    }
                // System.out.println(temp);
                char[] curr = temp.toCharArray();
                for(int i=0;i<4;i++){
                    if (curr[i] == '9') {
                        curr[i] = '0';
                    } else {
                        curr[i]++;
                    }
                    String str = new String(curr);
                    // if(str.equals(target)){
                    //     return count;
                    // }
                    if(!vis.contains(str)){
                        // System.out.println(str);
                        vis.add(str);
                        q.add(str);
                    }
                    if (curr[i] == '0') {
                        curr[i] = '9';
                    } else {
                        curr[i]--;
                    }
                    if (curr[i] == '0') {
                        curr[i] = '9';
                    } else {
                        curr[i]--;
                    }
                    str = new String(curr);
                    // if(str.equals(target)){
                    //     return count;
                    // }
                    if(!vis.contains(str)){
                        vis.add(str);
                        q.add(str);
                    }
                    if (curr[i] == '9') {
                        curr[i] = '0';
                    } else {
                        curr[i]++;
                    }
                }
            }
            // System.out.println("hwllo");
            count++;
        }
        return -1;
    }
}