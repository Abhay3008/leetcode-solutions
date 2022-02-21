class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> s = new HashSet<>();
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]!='.')
                if(s.add(board[i][j])==false)
             //   System.out.print(i+" "+j);   
                return false;
              
            }
            s.clear();
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[j][i]!='.')
                if(s.add(board[j][i])==false){
             //   System.out.print(i+" "+j);   
                return false;
                }
              
            }
            s.clear();
        }
        s.clear();
        for(int x = 0;x<board.length;x+=3)
        for(int y = 0;y<board[0].length;y+=3){
            for(int i=x;i<x+3;i++){
                for(int j=y;j<y+3;j++)
                if(board[i][j]!='.')
                if(s.add(board[i][j])==false) 
                return false;
            }
            s.clear();
        }
        return true;
    }
}