/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* insert(vector<int> &nums,int i,int n){
        if(i > n) return NULL;
        int mid = n-(n-i)/2;
        
        TreeNode* tmp = new TreeNode(nums[mid]);
        
        tmp->left = insert(nums,i,mid-1);
        tmp->right = insert(nums,mid+1,n);
        
        return tmp;
    }
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        
        TreeNode* root=NULL;
        
        root=insert(nums,0,nums.size()-1);
        
        return root;
    }
};