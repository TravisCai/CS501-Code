//Iteration

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


//Recursion

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
}
