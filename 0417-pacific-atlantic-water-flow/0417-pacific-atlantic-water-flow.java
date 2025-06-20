class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] nums) {
        int[][] vis = new int[nums.length][nums[0].length];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Pair> pac = new ArrayList<Pair>();
        for(int i=0,j=0;i<nums.length;i++){
            if(vis[i][j]==0)
                findOcean(nums,vis,i,j,pac);
        }
        for(int i=0,j=1;j<nums[0].length;j++){
            if(vis[i][j]==0)
                findOcean(nums,vis,i,j,pac);
        }
        vis = new int[nums.length][nums[0].length];
        List<Pair> atlantic = new ArrayList<Pair>();
        for(int i=0,j=nums[0].length-1;i<nums.length;i++){
            if(vis[i][j]==0)
                findOcean(nums,vis,i,j,atlantic);
        }
        for(int i=nums.length-1,j=0;j<nums[0].length-1;j++){
            if(vis[i][j]==0)
                findOcean(nums,vis,i,j,atlantic);
        }
        vis = new int[nums.length][nums[0].length];
        for(Pair x:pac){
            vis[x.i][x.j]++;
        }
        for(Pair x:atlantic){
            vis[x.i][x.j]++;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(vis[i][j]>1)
                    res.add(new ArrayList<>(Arrays.asList(i,j)));
            }
        }
        return res;
    }
    public void findOcean(int[][] nums, int[][] vis, int i, int j, List<Pair> list){
        list.add(new Pair(i,j));
        vis[i][j]=1;
        int dir[][]= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        for(int a=0;a<dir.length;a++){
            int x = i+dir[a][0];
            int y = j+dir[a][1];
            if(x>=0 && y>=0 && x<nums.length && y<nums[i].length && vis[x][y]==0 && nums[x][y]>=nums[i][j]){
                // System.out.println(x+" "+y);
                findOcean(nums,vis,x,y,list);
            }
        }
    }
}
class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}