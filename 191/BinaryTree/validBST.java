import java.util.Queue;
import java.util.LinkedList;

public class validBST{

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max){
            return false;
        }

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }

    public TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.offer(root);

        int index = 1;

        while(!q.isEmpty() && index < n){
            TreeNode curr = q.poll();

            if(arr[index] == null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                q.add(leftNode);
            }
            index++;

            if(index<n && arr[index] == null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                q.add(rightNode);
            }
            index++;
        }

        return root;
    }
    public static void main(String[] args) {
        Integer[] arr = {5,1,4,null,null,3,6};
        validBST obj = new validBST();

        TreeNode root = obj.arrayToTree(arr);
        System.out.println(obj.isValidBST(root));
    }
}