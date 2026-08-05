import java.util.LinkedList;
import java.util.Queue;

public class symmetricTree {

    private boolean isMirror(TreeNode left, TreeNode right){
        if(left.left == null && right.right == null) return true;
        if(left.left == null || right.right == null) return false;
        if(left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isMirror(root.left, root.right);
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.offer(root);

        int index = 1;

        while(!q.isEmpty() && index < n){
            TreeNode curr = q.poll();

            if(arr[index] != null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                q.add(leftNode);
            }
            index++;

            if(index<n && arr[index] != null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                q.add(rightNode);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args){
        Integer[] arr = {1,2,2,3,4,4,3};

        symmetricTree obj = new symmetricTree();
        TreeNode root = obj.arrayToTree(arr);

        System.out.println(obj.isSymmetric(root));
    }   
}