/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        int[] sum = new int[1];
        greaterTree(root,sum);
        return root;
    }
    
    public void greaterTree(TreeNode root, int[] sum)
    {
        if(root == null)
            return ;
        greaterTree(root.right , sum);
        sum[0] += root.val;
        root.val = sum[0];
        greaterTree( root.left, sum);
    }
}