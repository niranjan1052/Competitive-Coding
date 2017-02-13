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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
        return null;
        int start = 0, end = nums.length-1;
        int mid;
        TreeNode current1 = null;
        return helper(start,end ,nums);
        
    }
    
   /* public TreeNode helper (TreeNode root, int start, int end, int[] nums){
        if(start>end)
            return null;
        int mid  ;  
        if(root==null)
        {
            mid = (start + end )/2 ;
            TreeNode node =  new TreeNode(nums[mid]) ;
            root=node;
        }
        else{
             mid = (start+end)/2;
            if(nums[mid]<=root.val){
                root.left =  new TreeNode(nums[mid]);
                root=root.left;
            }else{
                root.right = new TreeNode (nums[mid]);
                root=root.right;
            }
        }
        
        helper(root,start,mid-1,nums);
        helper(root,mid+1,end,nums);
        return root;
    }*/
    
    public TreeNode helper(int start , int end , int[] nums){
        if(start>end)
            return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left =  helper(start,mid-1,nums);
        node.right = helper(mid+1,end,nums);
        return node;
    }
    
    
}