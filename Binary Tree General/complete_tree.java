public class complete_tree {

    public int countNodes(TreeNode root) {
        int sum = 0;
        if(root != null){
            sum++;
            sum += countNodes(root.left);
            sum += countNodes(root.right);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);

        p.right.left = new TreeNode(6);

        complete_tree obj = new complete_tree();
        System.out.println(obj.countNodes(p));

    }
}
