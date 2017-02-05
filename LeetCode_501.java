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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> modelist = new ArrayList<Integer>();
        
        int max = helper(map,root,0);
        
        if(max==0)
         return new int[0];
        int count=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>=max){
                modelist.add(m.getKey());
                count++;
            }
        }
        int[] arr = new int[modelist.size()];
        for(int i=0;i<modelist.size();i++)
          arr[i]= modelist.get(i);
        return arr;
    }
    
    public int helper(HashMap<Integer,Integer> map , TreeNode root , int max){
        if(root ==null)
          return max;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        int x = map.get(root.val);
        if( x>=max) max= x;
        int max1 = helper(map,root.left,max);
        int max2 = helper(map,root.right,max1);
        return max2;
        
    }
}