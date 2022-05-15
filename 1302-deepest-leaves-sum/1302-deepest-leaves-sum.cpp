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
    int summ(TreeNode* root,int h,int i){
        if(root==NULL) return 0;
        
        if(i==h)
            return root->val;
        
        int lsum=summ(root->left,h,i+1);
        int rsum=summ(root->right,h,i+1);
        
        return lsum+rsum;
        
    }
    int height(TreeNode* root){
        if(root == NULL) return 0;
        
        int lh=height(root->left);
        int rh=height(root->right);
        
        return max(lh,rh)+1;
    }
    int deepestLeavesSum(TreeNode* root) {
        int h=height(root);
        
        
        return summ(root,h,1);
    }        

};