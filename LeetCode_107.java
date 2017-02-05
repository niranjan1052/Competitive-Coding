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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        Queue <TreeNode> que = new LinkedList<TreeNode>();
        if(root==null)
         return output;
        que.add(root);
        TreeNode curr;
        ArrayList<Integer> list;
        while(!que.isEmpty()){
            int n = que.size();
            list = new ArrayList<Integer>();
            for(int i =0;i<n;i++){
                curr = que.remove();
                list.add(curr.val);
                if(curr.left!=null)
                    que.add(curr.left);
                if(curr.right!=null)
                    que.add(curr.right) ;
            }
          
            output.add(0,list);
        }
       
        return output;
    }
}