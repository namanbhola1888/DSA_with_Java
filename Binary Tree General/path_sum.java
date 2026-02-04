public class path_sum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;

        int remainingSum = targetSum - root.val;
        
        // check if leaf
        if (root.left == null && root.right == null) {
            return remainingSum == 0;
        }

        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    public static void main(String[] args) {
        int target_sum = 22;
        TreeNode p = new TreeNode(5);
        p.left = new TreeNode(4);
        p.right = new TreeNode(8);

        p.left.right = new TreeNode(11);
        p.left.right.left = new TreeNode(7);
        p.left.right.right = new TreeNode(2);

        p.right.left = new TreeNode(13);
        p.right.right = new TreeNode(4);
        p.right.right.right = new TreeNode(1);

        path_sum obj = new path_sum();
        System.out.println(obj.hasPathSum(p, target_sum));

    }
}
