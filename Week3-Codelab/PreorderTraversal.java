#Iteration

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null){
            return new ArrayList<>();
        }
        
        List<Integer>list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addFirst(root);
        
        while(!stack.isEmpty()){
            TreeNode cur = stack.removeFirst();
            list.add(cur.val);
            if(cur.right != null){
                stack.addFirst(cur.right);
            }
            if(cur.left != null){
                stack.addFirst(cur.left);
            }
        }
        return list;
    }
}
