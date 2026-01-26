public class invert_binary {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null; 

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        invert_binary obj = new invert_binary();
        TreeNode result  = obj.invertTree(p);
        System.out.println(result.val); 
        System.out.println(result.left.val); 
        System.out.println(result.right.val); 
    }
}