public class kth_smallest {

    int count=0;
    int result = -1;

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        if (count == k) return;  // stop if already found

        count++;

        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;   
    }

    public static void main(String[] args) {
        int k = 1;
        TreeNode p = new TreeNode(3);
        p.left = new TreeNode(1);
        p.right = new TreeNode(4);

        p.left.right = new TreeNode(2);

        kth_smallest obj = new kth_smallest();
        System.out.println(obj.kthSmallest(p, k));
    }
}
