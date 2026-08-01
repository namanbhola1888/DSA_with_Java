import java.util.LinkedList;
import java.util.Queue;

public class balancedTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;

        while(!queue.isEmpty() && index < n){
            TreeNode curr = queue.poll();

            if(arr[index] != null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                queue.offer(leftNode);
            }
            index++;

            if(index < n && arr[index] != null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                queue.offer(rightNode);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,3,null,null,4,4};

        balancedTree obj = new balancedTree();
        TreeNode root = obj.arrayToTree(arr);

        System.out.println(obj.isBalanced(root));
    }
}
