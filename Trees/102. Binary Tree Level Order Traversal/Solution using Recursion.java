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
    List<List<Integer>> list = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if( root == null)
            return new LinkedList<>();
        else
        {
            int height = height(root);
            for( int i = 1; i <= height ; i++){
                LinkedList<Integer> ok = new LinkedList<>();
                level(root,i,ok);
                list.add(new LinkedList<>(ok));
            }
        }
        return list;
    }
    public void level( TreeNode root , int level, List<Integer> ok)
    {
        if(root == null)
            return;
        
        if( level == 1){
            ok.add(root.val);
            return;
        }
        
            level(root.left, level - 1, ok);
            level(root.right,level - 1, ok);
    }
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}