class Solution {
public:
    int trap(vector<int>& nums) {
        int n=nums.size();
        vector<int> f(n),b(n);
        
        f[0] = -1;
        for(int i=1;i<n;i++)
            f[i] = max(nums[i-1],f[i-1]);
        b[n-1]=-1;
        for(int i=n-2;i>=0;i--)
            b[i] = max(nums[i+1],b[i+1]);
        
        int ans=0;
        for(int i=0;i<n;i++){
            if(i == 0 || i == n-1)
                continue;
            if(min(f[i],b[i]) > nums[i])
                ans+=min(f[i],b[i])-nums[i];
        }
        return ans;
    }
};