class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n=nums.size();
        
        if(n<3) return 0;
        std::sort(nums.begin(),nums.end());
        
        int ans=INT_MAX;
        
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            
            while(l<r){
                int sm = nums[i]+nums[r]+nums[l];
                
                if(ans == INT_MAX || abs(sm-target) < abs(ans-target))
                    ans=sm;
                
                if(sm == target)
                    return target;
                else if(sm < target)
                    l++;
                else r--;
            }
        }
        return ans;
    }
};