import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val) {this.val = val;};
    TreeNode(int val, TreeNode left, TreeNode right) {this.val = val; this.left = left; this.right = right;};
}

public class countNodes {
    int result = 0;

    public int[] postorderDfs(TreeNode node){
        if(node == null) return new int[] {0, 0};

        int[] left = postorderDfs(node.left);
        int[] right = postorderDfs(node.right);

        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;

        if(node.val == sum/count) result++;

        return new int[] {sum ,count};
    }

    public int averageOfSubtree(TreeNode root) {
        postorderDfs(root);
        return result;
    }

    public TreeNode arrayToTree(Integer[] arr){
        int n = arr.length;

        if(n == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int index = 0;

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

    public static void main(String[] args) {
        Integer[] nums = {4,8,5,0,1,null,6};

        countNodes obj = new countNodes();
        TreeNode root = obj.arrayToTree(nums);

        System.out.println(obj.averageOfSubtree(root));
    }
}
