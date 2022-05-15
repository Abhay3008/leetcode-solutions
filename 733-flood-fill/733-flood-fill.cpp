class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& nums, int sr, int sc, int c) {
        queue<pair<int,int>> q;
        q.push({sr,sc});
        
        int color = nums[sr][sc];
        nums[sr][sc] = c;
        vector<vector<int>> dir={{1,0},{0,1},{-1,0},{0,-1}};
        vector<vector<int>> visited(nums.size(),vector<int>(nums[0].size(),false));
        
        visited[sr][sc]=true;
        while(!q.empty()){
            int n=q.size();
            while(n--)
            {
                int x=q.front().first;
                int y=q.front().second;
                q.pop();
                
                for(int i=0;i<dir.size();i++){
                    if(dir[i][0]+x >=0 && dir[i][0]+x <nums.size() && dir[i][1]+y>=0 && dir[i][1] +y<nums[0].size()){
                        int xcor = dir[i][0]+x;
                        int ycor = dir[i][1]+y;
                        
                        if(nums[xcor][ycor] == color && !visited[xcor][ycor]){
                            q.push({xcor,ycor});
                            nums[xcor][ycor] = c;
                            visited[xcor][ycor]=true;
                        }
                    }
                }
            }
        }
        return nums;
    }
};