/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int f = 0;
    public int sumRootToLeaf(TreeNode root) {
        List<Integer> res = traverse(root, "");
        
        int sum = 0;
        for(int i = 0;i<res.size();i++)
            sum += res.get(i);
        return sum;
    }
    
    List<Integer> traverse(TreeNode root, String n){
       // System.out.print(n+" ");
        List<Integer> l = new ArrayList<Integer>();
        if(root==null) return l;
        
        if (root.left==null && root.right==null){
            char ch = (char)(root.val+'0');

            List<Integer> ls = new ArrayList<Integer>();
            int decimal = getDecimal(ch+n);

            ls.add(decimal);
            return ls;
        
        }
        else{
             char ch = (char)(root.val+'0');
           
            l.addAll(traverse(root.left, ch+n));
            l.addAll(traverse(root.right, ch+n));
                return l;
        }
        
        
    }
    public  int getDecimal(String b){  
        
    int d = 0;  
    int n = 0;  
        int i = 0;
    while(true){  
      if(i>=b.length() ){  
        break;  
      } else {  
          int temp = (int)(b.charAt(i++)-'0')%10;  
          d += temp*Math.pow(2, n);    
          n++;  
       }  
    }  
    return d;  
} 
}