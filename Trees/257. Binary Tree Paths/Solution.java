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
    List<String> list = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
       helper(root,"");
       return list;
            
    }
    public void helper(TreeNode root,String str)
    {
        if(root == null)
            return;
        if(str.equals(""))
            str += root.val;
        else
            str += "->"+root.val;
        if(root.left == null && root.right == null){
            list.add(str);
            return;
        }
        
        helper(root.left,str);
        helper(root.right,str);
    }
}