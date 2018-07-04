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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>();
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        double sum; 
        int n;
        while(!queue.isEmpty()){
            sum = 0;
            n = queue.size();
            for( int i = 0 ; i < n ; i++)
            {
                
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                
            }
            list.add(sum/n);
        }
        return list;
    }
}