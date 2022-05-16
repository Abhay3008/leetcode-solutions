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
    vector<int> postorderTraversal(TreeNode* root) {
        
        stack<TreeNode*> st;
        vector<int> ans;
        
        if(root==NULL) return ans;
        st.push(root);
        unordered_set<TreeNode*> sett;
        sett.insert(root);
        while(!st.empty()){
            auto tmp=st.top();
            
            while(tmp->left && sett.find(tmp->left) == sett.end()){
                st.push(tmp->left);
                tmp=tmp->left;
                sett.insert(tmp);
            }
            if(tmp->right && sett.find(tmp->right) == sett.end()) {
                st.push(tmp->right);
                sett.insert(tmp->right);
            }
            else{
                ans.push_back(tmp->val);
                st.pop();
            }
        }
        return ans;
    }
};