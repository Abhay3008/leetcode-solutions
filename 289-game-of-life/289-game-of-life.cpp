class Solution {
public:
    void gameOfLife(vector<vector<int>>& board) {
        int m = board.size();
        int n = board[0].size();
        
        vector<pair<int,int>> vp;
        for(int i =0 ;i<m;i++){
            for(int j = 0;j<n;j++){
                int cnt=0;
                
                if(i>0 && board[i-1][j]==1)
                    cnt++;
                if(j>0 && board[i][j-1]==1)
                    cnt++;
                if(i<m-1 && board[i+1][j]==1)
                    cnt++;
                if(j<n-1 && board[i][j+1]==1)
                    cnt++;
                if(i>0 && j>0 && board[i-1][j-1]==1)
                    cnt++;
                if(i>0 && j<n-1 && board[i-1][j+1]==1)
                    cnt++;
                if(i<m-1 && j>0 && board[i+1][j-1]==1)
                    cnt++;
                if(i<m-1 && j<n-1 && board[i+1][j+1]==1)
                    cnt++;
                
                
                if(board[i][j] == 1 && (cnt < 2 || cnt > 3))
                    vp.push_back({i,j});
                
                if(board[i][j] == 0 && cnt == 3)
                    vp.push_back({i,j});
                // cout << cnt << " ";
            }
        }
        for(int i=0;i<vp.size();i++){
            int f=vp[i].first;
            int s=vp[i].second;
            if(board[f][s] == 1)
                board[f][s] = 0;
            else board[f][s] = 1;
            
        }
    }
};