import java.util.ArrayList;
import java.util.List;

public class flatten_to_linkedlist {

    public void preorder(TreeNode node, List<TreeNode> list) {
        if (node == null) return;

        list.add(node);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();

        preorder(root, list);

        int n = list.size() -1;

        for(int i=0; i<n; i++){
            TreeNode curr = list.get(i);
            curr.left = null;
            curr.right = list.get(i+1);
        }
    }

    public static void printPreorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        flatten_to_linkedlist obj = new flatten_to_linkedlist();
        
        obj.flatten(root);
        printPreorder(root);
    }
}
