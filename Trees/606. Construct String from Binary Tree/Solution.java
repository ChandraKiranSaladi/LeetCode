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
    public String tree2str(TreeNode t) {
        return params(t);
    }
    
    public String params(TreeNode t)
    {
        
        if(t == null)
            return "";
        StringBuilder build = new StringBuilder();
        build.append(t.val);
        String left = params(t.left);
        String right = params(t.right);
        
        if(left == "" && right == "")
             return build.toString();
        
            build.append('(');
            build.append(left);
            build.append(')');
        
         if(right != ""){
            build.append('(');
            build.append(right);
            build.append(')');
        }
        return build.toString();
        
    }
    
    
    
}