import java.util.LinkedList;
import java.util.Queue;

public class maximumDepth{
    public int maxDepth(TreeNode root) {
        
        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    private TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;
        if(n == 0 || arr[0] == null) return null;

        Queue<TreeNode> q = new LinkedList();
        TreeNode root = new TreeNode(arr[0]);
        q.offer(root);

        int index = 1;

        while(!q.isEmpty() && index < n){
            TreeNode curr = q.poll();

            if(arr[index] != null){
                TreeNode leftNode = new TreeNode(arr[index]);
                curr.left = leftNode;
                q.offer(leftNode);
            }
            index++;

            if(index < n && arr[index] != null){
                TreeNode rightNode = new TreeNode(arr[index]);
                curr.right = rightNode;
                q.offer(rightNode);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args){
        Integer[] arr = {3,9,20,null,null,15,7};

        maximumDepth obj = new maximumDepth();
        TreeNode root = obj.arrayToTree(arr);

        System.out.println(obj.maxDepth(root));
    }
}