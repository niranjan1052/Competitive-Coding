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
    public List<List<Integer>> levelOrder(TreeNode root) {
     Queue<TreeNode> que = new LinkedList<TreeNode>();
     List<List<Integer>> levelorder = new ArrayList<List<Integer>>();
     if(root==null)
      return levelorder;
     que.add(root);
     //level order traversal using queue
     while(!que.isEmpty()){
       int size = que.size();
       List<Integer> levellist = new ArrayList<Integer>(); 
       for(int i =1;i<=size;i++){
           TreeNode current = que.remove();          
           // remove the current level nodes from queue and add all of their left and right nodes into queue
           levellist.add(current.val);               // add the removed into output list
          if(current.left!=null) que.add(current.left);
          if(current.right!=null) que.add(current.right);
       }
       levelorder.add(levellist);
       
     }
      
     return levelorder; 
      
      
    }
}