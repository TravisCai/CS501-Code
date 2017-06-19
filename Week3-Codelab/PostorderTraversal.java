//Ieteration

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        stack1.addFirst(root);
        
        while(!stack1.isEmpty()){
            TreeNode cur = stack1.removeFirst();
            stack2.addFirst(cur.val);
            if(cur.left != null){
                stack1.addFirst(cur.left);
            }
            if(cur.right != null){
                stack1.addFirst(cur.right);
            }
        }
        return new ArrayList<Integer>(stack2);
    }
}



//Recursion
