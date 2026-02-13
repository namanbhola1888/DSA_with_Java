public class validate_tree{

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max)
            return false;

        return validate(node.left, min, node.val) &&
            validate(node.right, node.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(5);
        p.left = new TreeNode(1);
        p.right = new TreeNode(4);

        p.left.left = new TreeNode(3);
        p.left.right = new TreeNode(6);

        validate_tree obj = new validate_tree();
        System.out.println(obj.isValidBST(p));
    }
}