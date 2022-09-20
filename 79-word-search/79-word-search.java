class Solution {
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public boolean exist(char[][] board, String word) {
        int[][] vis = new int[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                    if(dfs(board,word,i,j,vis,0))
                        return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word,int i, int j,int[][] vis,int x){
        if(board[i][j]!=word.charAt(x))
            return false;
        if(word.length()-1==x)
            return true;
        vis[i][j]=1;
        for(int[] d: dir){
            int r = i+d[0];
            int c = j+d[1];
            if(r>=0 && c>=0 && r<board.length && c<board[0].length && vis[r][c]==0)
            if(dfs(board,word,r,c,vis,x+1)){
                vis[i][j]=0;
                return true;
            }
        }
        vis[i][j]=0;
        return false;
        
    }
}