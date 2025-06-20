class Solution {
    public void solve(char[][] board) {
        int[][] vis = new int[board.length][board[0].length];
        char[][] temp = new char[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                temp[i][j] = board[i][j];
            }
        }
        for(int i=0,j=0;i<board.length;i++){
            if(vis[i][j]==0 && board[i][j]=='O')
                surround(temp,vis,i,j);
        }
        for(int i=0,j=1;j<board[0].length;j++){
            if(vis[i][j]==0 && board[i][j]=='O')
                surround(temp,vis,i,j);
        }

        for(int i=0,j=board[0].length-1;i<board.length;i++){
            if(vis[i][j]==0 && board[i][j]=='O')
                surround(temp,vis,i,j);
        }
        for(int i=board.length-1,j=0;j<board[0].length-1;j++){
            if(vis[i][j]==0 && board[i][j]=='O')
                surround(temp,vis,i,j);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(temp[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        return;
    }
    public void surround(char[][] temp,int[][] vis,int i,int j){
        // if(i==0 || i==board.length-1 || j==0 || j==board[0].length-1) return true;
        temp[i][j]='P';
        vis[i][j]=1;

        int dir[][]= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        for(int a=0;a<dir.length;a++){
            int x = i+dir[a][0];
            int y = j+dir[a][1];
            if(x>=0 && y>=0 && x<temp.length && y<temp[i].length && vis[x][y]==0 && temp[x][y]!='X'){
                // System.out.println(x+" "+y);
                surround(temp,vis,x,y);
            }
        }
    }
}
