class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        ls.add(new ArrayList<Integer>());
        ls.get(0).add(1);
        int x=0;
        numRows--;
        while(numRows>0){
            ls.add(new ArrayList<Integer>());
            ls.get(x+1).add(1);
            for(int i =1;i<ls.get(x).size();i++){
                ls.get(x+1).add(ls.get(x).get(i) + ls.get(x).get(i-1));
            }
            ls.get(x+1).add(1);
            x++;
            numRows--;
        }
        return ls;
    }
}