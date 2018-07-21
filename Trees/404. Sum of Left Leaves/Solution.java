/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */                     // This is one amazing solution ain't it?
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return getSumLeft(root , false);
    }
    
    public int getSumLeft( TreeNode root , boolean left )
    {
        if(root == null )
            return 0;
        if(root.left == null && root.right == null && left)
            return root.val;
        
        return getSumLeft( root.left , true ) + getSumLeft( root.right , false );
    }
}