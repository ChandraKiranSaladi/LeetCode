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
    
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return calc(set , root, k);
        
    }
    
    public boolean calc(HashSet<Integer> set , TreeNode root, int target)
    {
            if(root == null)
                return false;
        
            else{
               
                if(set.contains(target - root.val))
                    return true;
                 set.add(root.val);
            }
        
        return calc(set , root.left , target) || calc (set , root.right , target) ;
    }
}