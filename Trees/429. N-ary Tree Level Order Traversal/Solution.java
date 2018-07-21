/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<List<Integer>> list = new LinkedList<>();
    public List<List<Integer>> levelOrder(Node root) {
        helper(root,0);
        return list;
    }
    public void helper(Node root, int level)
    {
        if(root == null)
            return;
        if( level == list.size())
            list.add(new LinkedList<>());
        list.get(level).add(root.val);
        for(Node node : root.children)
            helper(node,level+1);
    }
}