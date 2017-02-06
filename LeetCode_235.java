/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode lca ;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
         return null;
         lca=root;
         if(p.val<root.val && q.val<root.val){
             lowestCommonAncestor(root.left,p,q);
         }
         else if(p.val>root.val && q.val>root.val){
             
             lowestCommonAncestor(root.right,p,q);
         }
         return lca;
          
    }
}