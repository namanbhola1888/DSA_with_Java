import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    private void pushLeft(TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.left;
        }   
    }
    
    public int next() {
        TreeNode node = stack.pop();

        if(node.right != null){
            pushLeft(node.right);
        }

        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void Inorder_traversal(TreeNode root){
        if(root == null) return;

        Inorder_traversal(root.left);
        System.out.print(root.val + " ");
        Inorder_traversal(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BSTIterator obj = new BSTIterator(root);
        obj.Inorder_traversal(root);

        System.out.println(obj.next());    
        System.out.println(obj.next());    
        System.out.println(obj.hasNext());  
        System.out.println(obj.next());    
        System.out.println(obj.hasNext());  
        System.out.println(obj.next());     
        System.out.println(obj.hasNext());  
        System.out.println(obj.next());     
        System.out.println(obj.hasNext());

    }
}
