import java.util.HashMap;

public class post_and_in {

    private int postIndex;

    public TreeNode buildTree(int[] postorder, int[] inorder) { 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        postIndex = postorder.length - 1;
        return helper(postorder, 0, inorder.length - 1, map);
    }

    private TreeNode helper(int[] postorder, int start, int end, HashMap<Integer, Integer> map) {
        if (start > end) return null;

        int rootValue = postorder[postIndex--];
        TreeNode node = new TreeNode(rootValue);

        int inorderIndex = map.get(rootValue);

        node.right = helper(postorder, inorderIndex + 1, end, map);
        node.left = helper(postorder, start, inorderIndex - 1, map);

        return node;
    }

    public static void printPostorder(TreeNode root) {
        if (root == null) return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};

        post_and_in obj = new post_and_in();
        TreeNode root = obj.buildTree(postorder, inorder);

        printPostorder(root);
    }    
}