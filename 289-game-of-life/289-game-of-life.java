class Solution {
    public void gameOfLife(int[][] board) {
        int arr[][] = new int[27][27];
        
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                int x = i+1;
                int y = j+1;
                arr[x-1][y-1] = arr[x-1][y-1] + board[i][j];
                arr[x-1][y] = arr[x-1][y] + board[i][j];
                arr[x-1][y+1] = arr[x-1][y+1] + board[i][j];
                arr[x][y-1] = arr[x][y-1] + board[i][j];
                arr[x][y+1] = arr[x][y+1] + board[i][j];
                arr[x+1][y-1] = arr[x+1][y-1] + board[i][j];
                arr[x+1][y] = arr[x+1][y] + board[i][j];
                arr[x+1][y+1] = arr[x+1][y+1] + board[i][j];
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                int x = i+1;
                int y = j+1;
                if(board[i][j]==0){
                    if(arr[x][y]==3)
                        board[i][j]=1;
                }
                if(board[i][j]==1){
                    if(arr[x][y]<2)
                        board[i][j]=0;
                    else if(arr[x][y]==2 || arr[x][y]==3)
                        board[i][j]=1;
                    else if(arr[x][y]>3)
                        board[i][j]=0;
                }
            }
        }
    }
}