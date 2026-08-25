import java.util.LinkedList;
import java.util.Queue;

public class kSmallest {
    int count = 0;
    int result = -1;

    private void inorder(TreeNode node, int k){
        if(node == null) return;

        inorder(node.left, k);
        if(count == k) return;

        count++;

        if(count == k){
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);

        return result;
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

    public static void main(String[] args) {
        Integer[] arr = {5,3,6,2,4,null,null,1};
        int k = 3;

        kSmallest obj = new kSmallest();
        TreeNode root = obj.arrayToTree(arr);
        System.out.println(obj.kthSmallest(root, k));
    }
}
