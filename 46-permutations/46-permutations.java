class Solution {
    public  List<List<Integer>> permute(int[] nums) {
        List<Integer> al = new ArrayList<Integer>();
        for(int x:nums)
            al.add(x);
        return permutate(al, new ArrayList<Integer>());
    }
     List<List<Integer>> permutate(List<Integer> up, List<Integer> p){

        if(up.size()==0){
            List<List<Integer>> ls = new ArrayList<List<Integer>>();
           // System.out.print(p);
            List<Integer> l = new ArrayList<>();
            for(int i = 0;i<p.size();i++)
                l.add(p.get(i));
            ls.add(l);
            System.out.print(ls);
            return ls;
        }
        int x = up.get(0);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> f =  new ArrayList<>();
        List<Integer> s =  new ArrayList<>();
        for(int i = 0;i<=p.size();i++){
            f.addAll(p.subList(0, i));
            s.addAll(p.subList(i, p.size()));
            s.add(0, x);
            //System.out.print(s);
            f.addAll(s);
            ans.addAll(permutate(up.subList(1, up.size()), f));
            f.removeAll(f);
            s.removeAll(s);
        }
        return ans;

    }
}