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
    double sum = 0, n = 0;
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>();
        List<Double> list = new ArrayList<Double>();
        int levels = height(root);
        for(int i = 1; i <= levels ; i++)
        {
            sum = 0; n = 0;
            getLevel(root,i);
            list.add(sum/n); // not sure for the correct value
            
        }
        return list;
    }
    
    public void getLevel(TreeNode root , int level)
    {
        if(root == null)
            return;
        if(level == 1)
        {
            sum += root.val;
            n++;
            return;
        }
        else
        {
            getLevel(root.left, level-1);
            getLevel(root.right, level-1);
        }
    }
    
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
        if(leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }
    
}