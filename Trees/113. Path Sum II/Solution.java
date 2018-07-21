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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        pathSumCalc(root,sum,new LinkedList<>());
        return list;
    }
    public void pathSumCalc(TreeNode root, int sum, List<Integer> ok) {
        if( root == null )
            return; 
        ok.add(root.val);
        if ( root.val == sum && root.left == null && root.right == null )
            list.add(new LinkedList<>(ok));
        
        pathSumCalc(root.left,sum - root.val,ok);
        pathSumCalc(root.right,sum - root.val,ok);
        ok.remove(ok.size()-1);
    }
}