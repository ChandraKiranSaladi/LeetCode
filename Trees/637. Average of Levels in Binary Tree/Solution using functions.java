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
    int n = 0;
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>();
        List<Double> list = new ArrayList<Double>();
        int levels = height(root);
        for(int i = 1; i <= levels ; i++)
        {
             n = 0;
        double sum = getLevel(root,i);
            list.add(sum/n); // not sure for the correct value
            
        }
        return list;
    }
    
    public double getLevel(TreeNode root , int level)
    {
        if(root == null)
            return 0;
        if(level == 1)
        {
            n++;
            return root.val;
        }
          return getLevel(root.left, level-1) + getLevel(root.right, level-1);
        
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